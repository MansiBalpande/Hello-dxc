package abstraction;

import org.junit.Test;

import junit.framework.TestCase;
public class BmwTest extends TestCase {

	@Test
	public void testAdd() {
		int expected = 30;
		int actual = BmwFlyingCar.add(10, 20);
		assertEquals(expected, actual);
	}
}
