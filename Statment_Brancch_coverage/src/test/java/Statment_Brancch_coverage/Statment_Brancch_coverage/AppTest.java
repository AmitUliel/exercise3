package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void b_bigger_than_a() {
		int a = 2;
		int b = 4;

		int expected = 2;
		int result = App.Add(a, b);
		assertEquals(expected, result, 0.001);
	}

	@Test
	public void a_bigger_than_b() {
		int a = 4;
		int b = 2;

		int expected = 2;
		int result = App.Add(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void a_thesame_b() {
		int a = 1;
		int b = 1;

		int expected = 0;
		int result = App.Add(a, b);
		assertEquals(expected, result, 0.001);
	}

	// didn't cover 100% statements but found the problem
	@Test
	public void statementCoverage_notFull_Find() {
		int x = 1;
		int y = 3;

		try {
			WeakClass.weakMethod1(x, y);
			fail("Expected ArithmeticException to be thrown");
		} catch (ArithmeticException e) {
			// Assert that the exception message is correct
			assertEquals("Can't divide by 0", e.getMessage());
		}
	}

	// cover 100% statements but didn't found the problem
	@Test
	public void statementCoverage_100_didntFind1() {
		int x = 10;
		int y = 7;

		int expected = 8;
		int result = WeakClass.weakMethod1(x, y);
		assertEquals(expected, result);
	}

	@Test
	public void statementCoverage_100_didntFind2() {
		int x = 8;
		int y = 1;

		int expected = 0;
		int result = WeakClass.weakMethod1(x, y);
		assertEquals(expected, result);
	}

	@Test
	public void branchCoverage_notFull_Find() {
		int x = 1;
		int y = 5;

		try {
			WeakClass.weakMethod1(x, y);
			fail("Expected ArithmeticException to be thrown");
		} catch (ArithmeticException e) {
			// Assert that the exception message is correct
			assertEquals("Can't divide by 0", e.getMessage());
		}
	}

}
