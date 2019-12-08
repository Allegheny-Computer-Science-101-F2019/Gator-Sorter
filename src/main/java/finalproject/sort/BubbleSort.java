package finalproject.sort;

import java.util.Arrays;

/**
 * An implementation of the BubbleSort sorting algorithm.
 *
 * @author Gregory M. Kapfhammer
 */


public class BubbleSort extends Sorter {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of this sorting algorithm. */
  public BubbleSort() {
    name = "BubbleSort";
  }
  // TODO: organize comments accordingly and ensure style
  /** Bubble-sort of an array of chars into a nondecreasing order. This
   * implementation of the sort method makes a complete copy of the input array,
   * thus ensuring that it does not modify the input parameter.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
   * for more details about the System.arraycopy() method.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public char[] sort(char[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < (length - 1); j++) {
        if (sorted[j] > sorted[j + 1]) {
          char temporary = sorted[j];
          sorted[j] = sorted[j + 1];
          sorted[j + 1] = temporary;
        }
      }
    }
    return sorted;
  }

  /** Bubble-sort of an array of ints into a nondecreasing order. This
   * implementation of the sort method makes a complete copy of the input array,
   * thus ensuring that it does not modify the input parameter.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
   * for more details about the System.arraycopy() method.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public int[] sort(int[] source) { // TODO will include calls to printWithSymbol
    int length = source.length;
    int[] sorted = new int[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    int iterationCounter = 0;
    for (int i = 0; i < length; i++) {
      iterationCounter = i;
      if (iterationCounter <= 1 || iterationCounter == sorted.length - 1) {
        System.out.println("Current iteration: " + iterationCounter);
      }
      for (int j = 0; j < (length - 1); j++) {
        printWithSymbol(sorted, j, "CURRENT PAIR => [", iterationCounter);
        if (sorted[j] > sorted[j + 1]) {
          printWithSymbol(sorted, j, "PAIR NOT IN ORDER => [", iterationCounter);
          int temporary = sorted[j];
          sorted[j] = sorted[j + 1];
          sorted[j + 1] = temporary;
          printWithSymbol(sorted, j, "VALUES SWAPPED => [", iterationCounter);
        }
      }
    }
    return sorted;
  }

  public int[] efficientSort(int[] source) {
    int length = source.length;
    int[] sorted = new int[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < (length - 1); j++) {
        if (sorted[j] > sorted[j + 1]) {
          int temporary = sorted[j];
          sorted[j] = sorted[j + 1];
          sorted[j + 1] = temporary;
        }
      }
    }
    return sorted;
  }

  public static void printWithSymbol(int[] source, int selectedIndex, String symbol, int counter) {
    String[] stringArray = new String[source.length];
    if (counter <= 1 || counter == source.length - 1) {
      for (int i = 0; i < source.length; i++) {
        if (i == selectedIndex) {
          stringArray[i] = symbol + Integer.toString(source[i]);
        } else if (i == selectedIndex + 1) {
          stringArray[i] = Integer.toString(source[i]) + "]";
        } else {
          stringArray[i] = Integer.toString(source[i]);
        }
      }
      System.out.println(Arrays.toString(stringArray));
      System.out.println();
    } else {
      //System.out.println("counter over limit");
    }
  }

  // TODO: Add javadoc comments for displayInfo method
  public void displayInfo() {
    // TODO: add info
  }
  /** Demonstrate the use of the BubbleSort algorithm. */
  // public static void main(String[] args) {
  //   char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
  //   System.out.println("Before: " + java.util.Arrays.toString(letters));
  //   char[] sortedLetters = (new BubbleSort()).sort(letters);
  //   System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  //   int[] numbers = {1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0};
  //   System.out.println("Before: " + java.util.Arrays.toString(numbers));
  //   int[] sortedNumbers = (new BubbleSort()).sort(numbers);
  //   System.out.println("After : " + java.util.Arrays.toString(sortedNumbers));
  // }
}
