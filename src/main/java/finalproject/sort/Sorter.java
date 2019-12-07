package finalproject.sort;

import java.util.Arrays;
/**
 * An interface for all of the sorting implementations.
 *
 * @author Decla Casey, Noor Buchi, Pedro Carmo, Nolan Thompson
 */

public abstract class Sorter {

  /** The name of the sorter. */
  protected String name;

  /** The default name of the sorter. */
  private static final String DEFAULT_SORTER = "default";

  /** Configure the name of the sorter. */
  public Sorter() {
    name = DEFAULT_SORTER;
  }

  /** The name of the sorter. */
  public String getName() {
    return name;
  }

  /** Require that a Sorter provide a method for char[] arrays. */
  public abstract char[] sort(char[] source);

  /** Require that a Sorter provide a method for int[] arrays. */
  public abstract int[] sort(int[] source);

/** Require that a Sorter provide an efficient sorter method for int[] arrays without print statements. */
  public abstract int[] efficientSort(int[] source);

  /** Require that the sorter provides a method to explain its properties. */
  public abstract void displayInfo();

  /** Done: add a Sorter and Timer method */
  public long sortToTime(int[] source) {
    long startTime = System.nanoTime();
    efficientSort(source);
    long endTime = System.nanoTime();
    long elapsed = endTime - startTime;
    return elapsed;
  }

  public static void printWithSymbol(int[] source, int selectedIndex, String symbol, int counter) {
    String[] stringArray = new String[source.length];
    if (counter < 6) {
      for (int i = 0; i < source.length; i++) {
        if (i == selectedIndex) {
          stringArray[i] = symbol + Integer.toString(source[i]);
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
  /** TODO: add a Sorter and Explain method  */

}
