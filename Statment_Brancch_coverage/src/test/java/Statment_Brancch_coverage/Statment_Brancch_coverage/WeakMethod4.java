package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod4 {
	@Test 
	public void test_2b1()
	{
		int x = 4;
		int y = 4;
		
		int result = WeakClass.weakMethod2(x, y);
		int expected = 2;
		
		assertEquals(expected, result);
	}
	
	@Test 
	public void test_2b2()
	{
		int x = -3;
		int y = 10;
		
		int result = WeakClass.weakMethod2(x, y);
		int expected = 7;
		
		assertEquals(expected, result);
		
	}
}
