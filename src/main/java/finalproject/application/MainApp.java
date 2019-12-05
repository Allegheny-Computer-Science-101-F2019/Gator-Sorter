package finalproject.application;

import finalproject.sort.BubbleSort;
import finalproject.sort.InsertionSort;
import finalproject.sort.SelectionSort;
import finalproject.sort.Sorter;
import java.util.Scanner;
import java.util.Random;

// Done: Add all of the needed comments to this file
/**
 * Main method creates RunCampaign,runs both bubbleSort and insertionSort in it.
 * and adds the result to the respecteive ResultsTable.
 *
 * @author Gregory M. Kapfhammer @author Noor Buchi
 */
public class MainApp {

  /**
   * main method receives no arguments.
   * used to create necessayry variables, call appropriate methods and update
   * output.
   */
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter the size of the data structure to be generated (Size must be greater than 1)");
    int dataSize = userInput.nextInt();
    Random random = new Random();
    if (dataSize <= 0) {
      System.out.println("The number you entered is not a valid size");
      System.out.println("A valid number will be randomly generated");
      dataSize = random.nextInt(500);
    }
    System.out.println("Size of array: " + dataSize);
    int[] testarray = new int[dataSize];
    for (int i = 0; i <= (dataSize - 1); i++) {
      int rnd2 = random.nextInt(99);
      testarray[i] = rnd2;
    }
    System.out.println("Please enter which sorting algorithm you wish to use:\n");
    System.out.println("For BubbleSort press 1 ");
    System.out.println("For InsertionSort press 2");
    System.out.println("For SelectionSort press 3\n");
    int sortselect = userInput.nextInt();
    if (sortselect == 1) {
      //Bubblesort
      System.out.println("You selected the BubbleSort");
    } else if (sortselect == 2) {
      //InsertionSort
      System.out.println("You selected the InsertionSort");
    } else if (sortselect == 3) {
      //SelectionSort
      System.out.println("You selected the SelectionSort");
    } else {
      System.out.println("Error: Number entered is not a valid choice");
      System.out.println("Number must be 1, 2, or 3");
      System.out.println("Please restart the program to continue");
    }

  }

}
