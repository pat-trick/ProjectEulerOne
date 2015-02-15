/**
 * Implementation of the ProjectEulerOne solution.
 *
 * Created by patrick on 2/1/15.
 */
public class ProjectEulerOne {

  /**
   * Computes the sum of multiples of 3 and 5 up to 1000.
   *
   * @param args ignored.
   */
  public static void main(String[] args) {

    int sum = computeSumOfMultiples(1000);

    System.out.println("Total sum is: " + sum);
  }

  /**
   * Computes the sum of multiples of 3 and 5 up to maxValue.
   *
   * @param maxValue the maximum value to check up to.
   * @return Sum of all multiples of 3 and 5 up to maxValue.
   */
  public static int computeSumOfMultiples(int maxValue) {

    int sum = 0;
    for (int i = 0; i < maxValue; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
    }
    return sum;
  }

}
