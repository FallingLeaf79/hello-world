import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;
import java.io.PrintWriter;

public class QuickSortThingy {

  public static List<Integer> loadList(String filename) throws IOException {
    FileReader reader = new FileReader(filename);
    Scanner sc = new Scanner(reader);
    List<Integer> list = new java.util.LinkedList<>();

    while (sc.hasNextInt()) {
      list.add(sc.nextInt());
    }

    sc.close();
    return list;
  }

  public static void saveList(
    List<Integer> list, String filename
    ) throws IOException {
    PrintWriter writer = new PrintWriter(filename);
    for (int i = 0; i < list.size(); i++) {
      writer.print(list.get(i) + " ");
    }
    writer.close();
  }

  public static void swapList(List<Integer> list, int i, int j) {
    int temp = list.get(i);
    list.set(i, list.get(j));
    list.set(j, temp);
  }

  public static void quickSort(List<Integer> list, int low, int high) {
    if (low < high) {
      int pivot = list.get(high);
      int wall = low;

      for (int i = low; i < high; i++) {
        if (list.get(i) <= pivot) {
          swapList(list, i, wall);
          wall++;
        }
      }
      swapList(list, high, wall);

      quickSort(list, low, wall - 1);
      quickSort(list, wall, high);
    }
  }

  public static void main(String[] args) throws IOException {
    List<Integer> list = loadList("random.txt");
    quickSort(list, 0, list.size() - 1);
    saveList(list, "sorted.txt");
  }
}
