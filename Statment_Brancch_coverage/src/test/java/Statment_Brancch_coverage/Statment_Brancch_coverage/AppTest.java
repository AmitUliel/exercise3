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
}
