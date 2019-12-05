package finalproject.sort;


public class SelectionSort extends Sorter {

  /** Define the index at which an array starts. */
  private static int ARRAY_START = 0;

  /** Define the name of this sorting algorithm. */
  public SelectionSort() {
    name = "SelectionSort";
  }

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
  // public char[] sort(char[] source) {
  //   int length = source.length;
  //   char[] sorted = new char[source.length];
  //   // TODO: Double check the sorting algorithm below for errors
  //   System.arraycopy(source, 0, sorted, 0, source.length);
  //   for (int i = 0; i < length; i++){
  //     int min_index = i;
  //     for (int j = i+1; j < length; j++){
  //       if (source[j] > source[min_index]){
  //         min_index = j;
  //       }
  //     }
  //     int temp = source[min_index];
  //     source[min_index] = source[i];
  //     source[i] = temp;
  //   }
  //   return sorted;
  // }

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
    int length = source.length;
    int[] sorted = new int[source.length];
    // TODO:Implement appropriate sorting algorithm
    // System.arraycopy(source, 0, sorted, 0, source.length);
    for (int i = 0; i < length; i++){
      int min_index = i;
      for (int j = i+1; j < length; j++){
        if (source[j] > source[min_index]){
          min_index = j;
        }
      }
      int temp = source[min_index];
      source[min_index] = source[i];
      source[i] = temp;
    }
    return sorted;
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
