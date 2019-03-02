public class ConsoleLoading {

  private static String repeatStuff(int repeat, char stuff) {
    String output = "";
    while (repeat > 0) {
      output += stuff;
      repeat--;
    }
    return output;
  }

  public static void updateProgress(int total, int whereWeNow) {
    int progressPercent = (whereWeNow * 100) / total;
    String percentDone = repeatStuff(progressPercent / 2, '=');
    String message = (whereWeNow == total) ? "Success!!!" : "Loading...";

    String loading = String.format(
      "\r %3d%% [%-50s] %6d/%-6d %s",
      progressPercent, percentDone, whereWeNow, total, message
    );
    System.out.print(loading);
  }

  public static void main(String[] args) {
    int total = Integer.parseInt(args[0]);

    for (int i = 0; i <= total; i++) {
      try {
        Thread.sleep(10);
        updateProgress(total, i);
      } catch (InterruptedException e) {
        System.out.print(e.getMessage());
      }
    }
  }
}
