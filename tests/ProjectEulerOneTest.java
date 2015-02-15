import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerOne class.
 *
 * Written by Patrick Karjala 2015/2/14
 */
public class ProjectEulerOneTest {

  /**
   * Tests various values for the computeSumOfMultiples method.
   *
   * @throws Exception Error message.
   */
  @Test
  public void testComputeSumOfMultiples() throws Exception {
    assertEquals("Values less than 16", 60, ProjectEulerOne.computeSumOfMultiples(16));
    assertEquals("Values less than 10", 23, ProjectEulerOne.computeSumOfMultiples(10));
  }
}