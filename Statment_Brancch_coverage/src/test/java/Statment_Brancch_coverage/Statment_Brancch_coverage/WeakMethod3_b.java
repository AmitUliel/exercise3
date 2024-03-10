package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod3_b {
	
	@Test (expected = java.lang.ArithmeticException.class)
	public void test_3b1()
	{
		int x = 0;
		int y = 2;
		WeakClass.weakMethod3(x, y);
	}
	
	@Test
	public void test_3b2()
	{
		int x = 1;
		int y = 3;
		
		int result = WeakClass.weakMethod3(x, y);
		int expected = 4;
		
		assertEquals(expected, result);
		
		
	}
	
	
	@Test
	public void test_3b3()
	{
		int x = 1;
		int y = 2;
		
		int result = WeakClass.weakMethod3(x, y);
		int expected = 3;
		
		assertEquals(expected, result);
	}
}
