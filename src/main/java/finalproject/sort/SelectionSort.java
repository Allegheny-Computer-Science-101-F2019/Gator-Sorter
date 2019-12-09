package finalproject.sort;

import java.util.Arrays;

/**
 * An implementation of the SelectionSort algorithm.
 *
 * @author Declan Casey, Noor Buchi, Pedro Carmo, Nolan Thompson
 */

public class SelectionSort extends Sorter {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of this sorting algorithm. */
  public SelectionSort() {
    name = "SelectionSort";
  }

  /** SelectionSort of an array of chars into a nondecreasing order.
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */

  public char[] sort(char[] source) {
    char[] sorted = new char[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    int arrayLength = source.length;
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < arrayLength - 1; i++) {
      // Find the minimum element in unsorted array
      int minIndex = i;
      for (int j = i + 1; j < arrayLength; j++) {
        if (sorted[j] < sorted[minIndex]) {
          minIndex = j;
        }
      }
      // Swap the found minimum element with the first
      // element
      char temp = sorted[minIndex];
      sorted[minIndex] = sorted[i];
      sorted[i] = temp;
    }
    return sorted;
  }

  /** SelectionSort of an array of ints into a nondecreasing order.
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public int[] sort(int[] source) {
    int[] sorted = new int[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    int printingCounter = 0;
    int arrayLength = source.length;
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < arrayLength - 1; i++) {
      // Find the minimum element in unsorted array
      int minIndex = i;
      printWithSymbol(sorted, i, "CURRENT INDEX =>", printingCounter);
      printingCounter = printingCounter + 1;
      for (int j = i + 1; j < arrayLength; j++) {
        if (sorted[j] < sorted[minIndex]) {  // finds minimum
          minIndex = j;
        }
      }
      printWithSymbol(sorted, minIndex, "FOUND MIN =>", printingCounter);
      // minimum is after bound
      // Swap the found minimum element with the first
      // element
      int temp = sorted[minIndex];
      sorted[minIndex] = sorted[i];
      sorted[i] = temp;
      printWithSymbol(sorted, i, "VALUES SWAPPED =>", printingCounter);
      printingCounter = printingCounter + 1;
    }
    System.out.println();
    System.out.println("Array sorted:");
    System.out.println(Arrays.toString(sorted));
    System.out.println();
    return sorted;
  }

  /** efficientSort is intended to mimimize time and is only called by timing method. */
  public int[] efficientSort(int[] source) {
    int[] sorted = new int[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    int arrayLength = source.length;
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < arrayLength - 1; i++) {
      // Find the minimum element in unsorted array
      int minIndex = i;
      for (int j = i + 1; j < arrayLength; j++) {
        if (sorted[j] < sorted[minIndex]) { // finds minimum
          minIndex = j;
        }
      }
      // Swap the found minimum element with the first element
      int temp = sorted[minIndex];
      sorted[minIndex] = sorted[i];
      sorted[i] = temp;
    }
    return sorted;
  }

  /**
  * This method contains println statements that display information about.
  * the sorting method.
  */

  public void displayInfo() {
    System.out.println();
    System.out.println("The selection sort algorithm sorts an array by repeatedly"
        + " finding the minimum element from unsorted part and putting it at the beginning.");
    System.out.println();
    System.out.println("The algorithm maintains two subarrays in a given array. "
        + "The subarray which is already sorted and subarray which is unsorted.");
    System.out.println();
    System.out.println("In every iteration of selection sort, the minimum "
        + "element from the unsorted subarray is picked and moved to the sorted subarray.");
    System.out.println();
    System.out.println("Worst case time complexity of SelectionSort is O(n^2)");
  }
}
