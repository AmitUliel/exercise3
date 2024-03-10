package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod4_a {
	
	@Test 
	public void test_4a1()
	{
		int x = 4;
		int y = 4;
		
		int result = WeakClass.weakMethod4(x, y);
		int expected = 2;
		
		assertEquals(expected, result);
	}
	
	@Test 
	public void test_4a2()
	{
		int x = 15;
		int y = 3;
		
		int result = WeakClass.weakMethod4(x, y);
		int expected = 6;
		
		assertEquals(expected, result);
	}
	
	@Test 
	public void test_4a3()
	{
		int x = 4;
		int y = 3;
		
		int result = WeakClass.weakMethod4(x, y);
		int expected = 1+3/4;
		
		assertEquals(expected, result);
	}
}
