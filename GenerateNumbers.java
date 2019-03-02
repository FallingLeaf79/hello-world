import java.io.PrintWriter;

public class GenerateNumbers {

  public static final int NUMBERS_TO_GENERATE = 10000;
  public static final int LIMIT = 1000000;


  public static void main(String[] args) throws java.io.IOException {
    java.util.Random  random = new java.util.Random();
    PrintWriter writer = new PrintWriter("random.txt");
    int out;

    int numbersToGenerate =
      (args.length > 0) ? Integer.parseInt(args[0]) : NUMBERS_TO_GENERATE;
    int limit =
      (args.length > 1) ? Integer.parseInt(args[1]) : LIMIT;

    while (numbersToGenerate > 0) {
      out = random.nextInt(limit);
      writer.print(out + " ");
      numbersToGenerate--;
    }
    writer.close();
    }



}
