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

		String expected = "Can't divide by 0";
		String result = WeakClass.weakMethod1(x, y);
		assertEquals(expected, result);
	}

	// cover 100% statements but didn't found the problem
	@Test
	public void statementCoverage_100_didntFind1() {
		int x = 10;
		int y = 7;

		String expected = Integer.toString(y + 2);
		String result = WeakClass.weakMethod1(x, y);
		assertEquals(expected, result);
	}

	@Test
	public void statementCoverage_100_didntFind2() {
		int x = 8;
		int y = 1;

		String expected = Integer.toString();
		String result = WeakClass.weakMethod1(x, y);
		assertEquals(expected, result);
	}

	// didn't cover 100% branches but found the problem
	@Test
	public void branchCoverage_notFull_Find() {
		int x = 1;
		int y = 5;

		String expected = "Can't divide by 0";
		String result = WeakClass.weakMethod2(x, y);
		assertEquals(expected, result);
	}

	// cover 100% branches but didn't found the problem
	@Test
	public void branchCoverage_Full_didNotFind1() {
		int x = 5;
		int y = 3;

		String expected = Integer.toString((y - 1) / (x - 1));
		String result = WeakClass.weakMethod2(x, y);
		assertEquals(expected, result);
	}

	@Test
	public void branchCoverage_Full_didNotFind2() {
		int x = 10;
		int y = 1;

		String expected = Integer.toString((y - 1) + 2);
		String result = WeakClass.weakMethod2(x, y);
		assertEquals(expected, result);
	}

	@Test
	public void branchCoverage_Full_didNotFind3() {
		int x = 5;
		int y = 14;

		String expected = Integer.toString(((y - 1) / (x - 1)) + 2);
		String result = WeakClass.weakMethod2(x, y);
		assertEquals(expected, result);
	}

	// 100% statements AND <100% branches coverage and did not found the problem
	@Test
	public void sFull_bNotFull_didNotFind() {
		int x = 10;
		int y = 2;

		String expected = Integer.toString((y + 1) / (x - 1));
		String result = WeakClass.weakMethod3(x, y);
		assertEquals(expected, result);
	}

	// 100% branches coverage and found the problem
	@Test
	public void bFull_Find() {
		int x = 1;
		int y = 4;

		String expected = Integer.toString((y + 1) / (x - 1));
		String result = WeakClass.weakMethod3(x, y);
		assertEquals(expected, result);
	}
	
	@Test
	public void bFull_Find2() {
		int x = 0;
		int y = 3;

		String expected = Integer.toString(y/x);
		String result = WeakClass.weakMethod3(x, y);
		assertEquals(expected, result);
	}
}
