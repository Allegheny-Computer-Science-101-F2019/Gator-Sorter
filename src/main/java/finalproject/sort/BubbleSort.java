package finalproject.sort;

import java.util.Arrays;

/**
 * An implementation of the BubbleSort sorting algorithm.
 *
 * @author Declan Casey, Noor Buchi, Pedro Carmo, Nolan Thompson
 */


public class BubbleSort extends Sorter {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of this sorting algorithm. */
  public BubbleSort() {
    name = "BubbleSort";
  }

  /** selection sort of an array of chars into a nondecreasing order.
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

  /** selection sort of an array of ints into a nondecreasing order.
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
        System.out.println();
        System.out.println();
        System.out.println("Current iteration: " + iterationCounter);
        System.out.println();
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
    System.out.println();
    System.out.println("Array sorted:");
    System.out.println(Arrays.toString(sorted));
    System.out.println();
    return sorted;
  }

  /**
  * This method is intended to sort an array without any println statements.
  * It will be used to time sorting and ensure an accurate timing when called.
  */

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

  /**
  * This method adds a string at a specified index of an array.
  * It is used to facilitate the explanation of the sorting process.
  */

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
    } else {
      //System.out.println("counter over limit");
    }
  }

  /**
  * This method contains println statements that display information about.
  * the sorting method.
  */

  public void displayInfo() {
    System.out.println();
    System.out.println(
        "The bubble sort algorithm sorts an array by repeatedly by swapping "
        + "the adjacent elements, the 'bubble', if they are in wrong order.");
    System.out.println();
    System.out.println("The algorithm compares the first two elements and "
        + "swaps them if they are in the wrong order. The 'bubble' shifts one "
        + "index over and reapets the process until the pass is complete.");
    System.out.println();
    System.out.println("Once it is sorted correctly, the algorithm needs "
        + "one more complete pass in order to confirm that the array is sorted.");
    System.out.println();
    System.out.println(
        "Worst case time complexity of SelectionSort is O(n^2)");
  }
}
