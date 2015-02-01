/**
 * Created by patrick on 2/1/15.
 */
public class ProjectEulerOne {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
    }
    System.out.println("Total sum is: " + sum);
  }
}
