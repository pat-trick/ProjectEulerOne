import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test class for the ProjectEulerOne class.
 */
public class ProjectEulerOneTest {

  /**
   * Tests the functionality of the computeSumOfMultiples method.
   *
   * @throws Exception any error resulting from an assertion.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("The sum of values up to 5",3, ProjectEulerOne.computeSumOfMultiples(5));
    assertEquals("The sum of values up to 10",23, ProjectEulerOne.computeSumOfMultiples(10));
  }
}