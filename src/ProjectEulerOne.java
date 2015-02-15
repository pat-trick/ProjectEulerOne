/**
 * An implementation of the ProjectEulerOne problem.
 *
 * Created by patrick on 2/1/15.
 */
public class ProjectEulerOne {

  /**
   * The primary method; computes sums up to 1000 for the
   * multiples of 3 and 5.
   *
   * @param args ignored.
   */
  public static void main(String[] args) {

    int sum = computeSumOfMultiples(1000);
    System.out.println("Total sum is: " + sum);
  }

  /**
   * Computes the sum of multiples of 3 and 5 up to a specified value.
   *
   * @param loopCeiling The max value to test up to.
   * @return The sum of all multiples of 3 and 5 up to loopCeiling.
   */
  public static int computeSumOfMultiples(int loopCeiling) {

    int sum = 0;
    for (int i = 0; i < loopCeiling; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
    }
    return sum;
  }
}
