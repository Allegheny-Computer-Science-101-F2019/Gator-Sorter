package finalproject.sort;

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

  /** TODO: add a Sorter and   Timer method */
  public long sortToTime(int[] source) {
    long startTime = System.currentTimeMillis();
    sort(source);
    long endTime = System.currentTimeMillis();
    long elapsed = endTime - startTime;
    return elapsed;
  }

  /** TODO: add a Sorter and Explain method */
}
