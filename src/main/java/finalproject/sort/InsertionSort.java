package finalproject.sort;

import java.util.Arrays;

/**
 * An implementation of the InsertionSort algorithm.
 *
 * @author Declan Casey, Noor Buchi, Pedro Carmo, Nolan Thompson
 */

public class InsertionSort extends Sorter {

  /** Define the name of this sorting algorithm. */
  public InsertionSort() {
    name = "InsertionSort";
  }

  /** Insertion-sort of an array of chars into a nondecreasing order.
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */

  public char[] sort(char[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    System.arraycopy(source, 0, sorted, 0, source.length);
    for (int i = 1; i < length; i++) {
      char currentValue = sorted[i];
      int start = i;
      while (start > 0 && sorted[start - 1] > currentValue) {
        sorted[start] = sorted[start - 1];
        start--;
      }
      sorted[start] = currentValue;
    }
    return sorted;
  }

  /** Insertion-sort of an array of ints into a nondecreasing order.
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */

  public int[] sort(int[] source) {
    int length = source.length;
    int[] sorted = new int[source.length];
    System.arraycopy(source, 0, sorted, 0, source.length);
    int printingCounter = 0;
    for (int i = 1; i < length; i++) {
      int currentValue = sorted[i];
      int start = i;
      printWithSymbol(sorted, start, "CURRENT BOUND =>", printingCounter);
      while (start > 0 && sorted[start - 1] > currentValue) {
        printWithSymbol(sorted, start - 1, "BIGGER PREVIOUS VALUE =>", printingCounter);
        sorted[start] = sorted[start - 1];
        printWithSymbol(sorted, start, "VALUE COPIED =>", printingCounter);
        start--;
      }
      sorted[start] = currentValue;
      printWithSymbol(sorted, start, "CORRECT VALUE INSERTED =>", printingCounter);
      printingCounter = printingCounter + 3;
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
    System.arraycopy(source, 0, sorted, 0, source.length);
    for (int i = 1; i < length; i++) {
      int currentValue = sorted[i];
      int start = i;
      while (start > 0 && sorted[start - 1] > currentValue) {
        sorted[start] = sorted[start - 1];
        start--;
      }
      sorted[start] = currentValue;
    }
    return sorted;
  }

  /**
  * This method contains println statements that display information about.
  * the sorting method.
  */

  public void displayInfo() {
    System.out.println();
    System.out.print("The insertion sort algorithm sorts an array by repeatedly "
        + "comparing the current element to previous ones.");
    System.out.println();
    System.out.print("The algorithm inserts the current element in the spot "
        + " where the previous element is less than the current one.");
    System.out.println();
    System.out.print("Space is created for it by shifting the other elements one ");
    System.out.println("position to the right and inserting the element at the suitable position.");
    System.out.println();
    System.out.println("Worst case time complexity of SelectionSort is O(n^2)");
  }
}
