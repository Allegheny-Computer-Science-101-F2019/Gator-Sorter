package finalproject.application;

import finalproject.sort.BubbleSort;
import finalproject.sort.InsertionSort;
import finalproject.sort.SelectionSort;
import finalproject.sort.Sorter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

// Done: Add all of the needed comments to this file
/**
 * Main method creates RunCampaign,runs both bubbleSort and insertionSort in it.
 * and adds the result to the respecteive ResultsTable.
 *
 * @author Gregory M. Kapfhammer @author Noor Buchi
 */
public class MainApp {

  /**
   * main methd receives no arguments.
   * used to create necessayry variables, call appropriate methods and update
   * output.
   */
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter the size of the data structure to be generated");
    int dataSize = userInput.nextInt();
    System.out.println(dataSize);
    BubbleSort bubbleSorter = new BubbleSort();
    int[] myArray = {9,8,7,6,5,4,2,1};
    // for (int i = 4; i >= 0; i--) {
    //   myArray[i] = i;
    // }
    System.out.println(Arrays.toString(myArray));
    System.out.println(Arrays.toString(bubbleSorter.sort(myArray)));
  }

}
