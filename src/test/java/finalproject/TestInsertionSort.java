package finalproject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import finalproject.sort.InsertionSort;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * A JUnit test suite for the InsertionSort.
 *
 * @author Declan Casey, Noor Buchi, Pedro Carmo, Nolan Thompson
 */

public class TestInsertionSort {

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_ITEMS = 100;

  /** The maximum number of items to use for testing. */
  private static int MAXIMUM_NUMBER_CHARS = 43;

  /** The size of the alphabet for character generation. */
  private static int ALPHABET_SIZE = 26;

  /** The starting character. */
  private static char STARTING_CHARACTER = 'a';

  /** A method to determine if an array is isSorted. */
  private boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void testisSortedCheckerWorksForSortedInt() {
    int[] numbers = {1, 2, 3};
    assertTrue(isSorted(numbers));
  }

  @Test
  public void testisSortedCheckerWorksForUnSortedInt() {
    int[] numbers = {2, 1, 3};
    assertTrue(!isSorted(numbers));
  }

  @Test
  public void testInsertionSortCorrectName() {
    assertEquals((new InsertionSort()).getName(), "InsertionSort");
  }

  @Test
  public void testInsertionSortWithInt() {
    int[] numbers = {1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0};
    int[] sortedNumbers = (new InsertionSort()).efficientSort(numbers);
    assertTrue(!isSorted(numbers));
    assertTrue(isSorted(sortedNumbers));
    int[] numbersClone = Arrays.copyOf(numbers, numbers.length);
    Arrays.sort(numbersClone);
    assertArrayEquals(sortedNumbers, numbersClone);
  }

  @Test
  public void testInsertionSortWithManyOrderedInts() {
    int[] originalArray = new int[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = i;
    }
    int[] sortedArray = (new InsertionSort()).efficientSort(originalArray);
    assertTrue(isSorted(originalArray));
    assertTrue(isSorted(sortedArray));
    int[] originalClone = Arrays.copyOf(originalArray, originalArray.length);
    Arrays.sort(originalClone);
    assertArrayEquals(sortedArray, originalClone);
  }

  @Test
  public void testInsertionSortWithManyRandomInts() {
    Random random = new Random();
    int[] originalArray = new int[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = random.nextInt();
    }
    int[] sortedArray = (new InsertionSort()).efficientSort(originalArray);
    assertTrue(isSorted(sortedArray));
    int[] originalClone = Arrays.copyOf(originalArray, originalArray.length);
    Arrays.sort(originalClone);
    assertArrayEquals(sortedArray, originalClone);
  }
}
