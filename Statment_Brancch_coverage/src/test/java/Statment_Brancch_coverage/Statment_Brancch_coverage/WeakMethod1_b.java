package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod1_b{
	
	@Test
	public void test_1b()
	{
		int x = 0;
		int y = 2;
		
		int result = WeakClass.weakMethod1(x, y);
		int expected = 8;
		
		assertEquals(expected,result);
		
	}
	
	
	@Test
	public void test_2b()
	{
		int x = 2;
		int y = 2;
		
		int result = WeakClass.weakMethod1(x, y);
		int expected = 12;
		
		assertEquals(expected,result);
		
	}
}
