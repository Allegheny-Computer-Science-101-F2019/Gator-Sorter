package finalproject.sort;

import java.util.Arrays;

public class SelectionSort extends Sorter {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of this sorting algorithm. */
  public SelectionSort() {
    name = "SelectionSort";
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
    int n = source.length;
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n-1; i++)
    {
        // Find the minimum element in unsorted array
        int min_idx = i;
        for (int j = i+1; j < n; j++)
            if (source[j] < source[min_idx])
                min_idx = j;

        // Swap the found minimum element with the first
        // element
        char temp = source[min_idx];
        source[min_idx] = source[i];
        source[i] = temp;
    }
    return source;
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
  public int[] sort(int[] source) {
    int[] sorted = new int[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    int printingCounter = 0;
    int n = source.length;
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n-1; i++) {
        // Find the minimum element in unsorted array
        int min_idx = i;
        printWithSymbol(sorted, i, "CURRENT INDEX =>", printingCounter);
        printingCounter = printingCounter + 1;
        for (int j = i+1; j < n; j++) {
          if (sorted[j] < sorted[min_idx]) { // finds minimum
            min_idx = j;
          }
        }
        // TODO printWithSymbol (arr source, index min_idx, symbol >, printingCounter) shows where the
        printWithSymbol(sorted, min_idx, "FOUND MIN =>", printingCounter);
        // minimum is after bound
        // Swap the found minimum element with the first
        // element
        int temp = sorted[min_idx];
        sorted[min_idx] = sorted[i];
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

  /** efficientSort is intended to mimimize time and is only called by timing method */
  public int[] efficientSort(int[] source) {
    int[] sorted = new int[source.length];
    System.arraycopy(source, ARRAY_START, sorted, ARRAY_START, source.length);
    int n = source.length;
    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n-1; i++) {
        // Find the minimum element in unsorted array
        int min_idx = i;
        for (int j = i+1; j < n; j++) {
          if (sorted[j] < sorted[min_idx]) { // finds minimum
            min_idx = j;
          }
        }
        // Swap the found minimum element with the first element
        int temp = sorted[min_idx];
        sorted[min_idx] = sorted[i];
        sorted[i] = temp;
    }
    return sorted;
  }

  // TODO: Add javadoc comments for displayInfo method
  public void displayInfo() {
    // Done: add info
    System.out.println();
    System.out.println("The selection sort algorithm sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the beginning.");
    System.out.println();
    System.out.println("The algorithm maintains two subarrays in a given array. The subarray which is already sorted and subarray which is unsorted.");
    System.out.println();
    System.out.println("In every iteration of selection sort, the minimum element from the unsorted subarray is picked and moved to the sorted subarray.");
    System.out.println();
    System.out.println("Worst case time complexity of SelectionSort is O(n^2)");
  }
  /** Demonstrate the use of the BubbleSort algorithm. */
  // public static void main(String[] args) {
  //   char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
  //   System.out.println("Before: " + java.util.Arrays.toString(letters));
  //   char[] sortedLetters = (new SelectionSort()).sort(letters);
  //   System.out.println("After : " + java.util.Arrays.toString(sortedLetters));
  //   int[] numbers = {1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0};
  //   System.out.println("Before: " + java.util.Arrays.toString(numbers));
  //   int[] sortedNumbers = (new SelectionSort()).sort(numbers);
  //   System.out.println("After : " + java.util.Arrays.toString(sortedNumbers));
  // }
}
