public class BabyShark {
  private static String[] SHARK = new String[] {
    "Baby", "Mommy", "Daddy", "Grandma", "Grandpa"
  };

  public static void doo() {
    for (int i = 0; i < 6; i++){
      System.out.print("doo ");
    }
  }

  public static void main(String[] args) {
    for (String shark : SHARK) {
      for (int i = 0; i < 3; i++) {
        System.out.printf("%s shark ", shark);
        doo();
        System.out.println();
      }
      System.out.printf("%s shark!\n\n", shark);
    }
  }
}
