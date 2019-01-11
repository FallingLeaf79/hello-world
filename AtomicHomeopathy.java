public class AtomicHomeopathy {

  public static double getGrams(String dose) {
    String regex = "[^a-z0-9]+|(?<=[a-z])(?=[0-9])|(?<=[0-9])(?=[a-z])";
    String[] doseSplit = dose.split(regex);

    double doseDouble = Double.parseDouble(doseSplit[0]);
    switch (doseSplit[1]) {
      case "mg":
        return doseDouble / 1000;
      case "g":
        return doseDouble;
      case "kg":
        return doseDouble * 1000;
    }
    return doseDouble;
  }

  public static double getDilutionFactor(String dilution) {
    String dilutionPowerString = dilution.substring(0, (dilution.length() - 1));
    double dilutionPower = Double.parseDouble(dilutionPowerString);

    double potency = 0;
    switch (dilution.charAt(dilution.length() - 1)) {
      case 'D':
      case 'X':
        potency = 1;
        break;
      case 'C':
        potency = 2;
        break;
    }

    return (potency * dilutionPower);
  }

  public static void main(String[] args) {
    String dose = (args[0]); //4g, 12mg, etc.
    String dilution = (args[1]); //12D, 30C, 4X, etc.

    double dosageGrams = getGrams(dose);
    double dilutionExp = getDilutionFactor(dilution);

    double effectiveGrams = dosageGrams / (Math.pow(10, dilutionExp));
    double smallerUnits = effectiveGrams;
    int expSI = 0;

    while (smallerUnits < 1) {
      smallerUnits *= 1000;
      expSI += 1;
      if (expSI == 8) {
        break;
      }
    }

    String[] prefixes = {
      "", "mili", "micro", "nano", "pico",
      "femto", "atto", "zepto", "yocto"
    };

    java.text.DecimalFormat df = new java.text.DecimalFormat(
    "#.################################################################################################################################################################################################################################################################################################################################################################################################################"
    );
    
    System.out.printf(
      "This dose has roughly %s %sgrams of the active ingredient.\n",
      df.format(smallerUnits), prefixes[expSI]);
  }
}
