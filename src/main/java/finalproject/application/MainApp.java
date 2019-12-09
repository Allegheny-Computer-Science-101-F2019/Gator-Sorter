package finalproject.application;

import finalproject.sort.BubbleSort;
import finalproject.sort.InsertionSort;
import finalproject.sort.SelectionSort;
import finalproject.sort.Sorter;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

// Done: Add all of the needed comments to this file
/**
 * Main method creates RunCampaign,runs both bubbleSort, selectionSort and insertionSort in it.
 * and adds the result to the respecteive ResultsTable.
 *
 * @author Declan Casey, Noor Buchi, Pedro Carmo, Nolan Thompson
 */
public class MainApp {

  /**
   * This method generates an array with random numbers between 0 and 99.
   * The size of the array depends on the argument requestedSize.
   */
  public static int[] generateRandomArray(int requestedSize) {
    Random valueGenerator = new Random();
    int[] filledArray = new int[requestedSize];
    for (int i = 0; i <= (requestedSize - 1); i++) {
      int randomValue = valueGenerator.nextInt(99);
      filledArray[i] = randomValue;
    }
    return filledArray;
  }

  /**
   * main method receives no arguments.
   * used to create necessayry variables, call appropriate methods and update
   * output.
   */
  public static void main(String[] args) {
    System.out.println("Welcome to GatorSorter!");
    System.out.println();
    System.out.println(
        "This program will help you learn about some basic sorting algorithms");
    System.out.println();
    Scanner userInput = new Scanner(System.in);
    int dataSize = 0;
    while (dataSize < 5 || dataSize > 20) {
      System.out.println(
          "Please enter the size of the data structure to be generated ");
      System.out.print("(Size must be between 5 and 20)");
      dataSize = userInput.nextInt();
    }
    System.out.println("Chosen size of array: " + dataSize);
    int[] originalArray = generateRandomArray(dataSize);
    System.out.println("Genereated Array: " + Arrays.toString(originalArray));
    int[] copiedArray = new int[dataSize];
    System.arraycopy(originalArray, 0, copiedArray, 0, dataSize);
    int sortselect = 0;
    while (sortselect < 1 || sortselect > 3) {
      System.out.println("Please enter which sorting algorithm you wish to use:\n");
      System.out.println("For BubbleSort enter 1 ");
      System.out.println("For InsertionSort enter 2");
      System.out.println("For SelectionSort enter 3\n");
      sortselect = userInput.nextInt();
    }
    if (sortselect == 1) {
      //Bubblesort
      BubbleSort bubbleSorter = new BubbleSort();
      System.out.println("You selected the BubbleSort");
      bubbleSorter.sort(originalArray);
      System.out.println();
      System.out.println("Time taken to sort using " + bubbleSorter.getName()
                + ": " + bubbleSorter.sortToTime(copiedArray) + " nanoseconds");
      bubbleSorter.displayInfo();
    } else if (sortselect == 2) {
      //InsertionSort
      InsertionSort insertionSorter = new InsertionSort();
      System.out.println("You selected the InsertionSort");
      insertionSorter.sort(originalArray);
      System.out.println();
      System.out.println("Time taken to sort using " + insertionSorter.getName()
                + ": " + insertionSorter.sortToTime(copiedArray) + " nanoseconds");
      insertionSorter.displayInfo();
    } else if (sortselect == 3) {
      //SelectionSort
      SelectionSort selectionSorter = new SelectionSort();
      System.out.println("You selected the SelectionSort");
      selectionSorter.sort(originalArray);
      System.out.println();
      System.out.println("Time taken to sort using " + selectionSorter.getName()
                + ": " + selectionSorter.sortToTime(copiedArray) + " nanoseconds");
      selectionSorter.displayInfo();
    }
  }
}
