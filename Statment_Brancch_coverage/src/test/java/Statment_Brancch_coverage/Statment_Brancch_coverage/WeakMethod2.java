package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod2 {
	
	@Test
	public void test_1b()
	{
		int x = 0;
		int y = 5;
		
		int result = WeakClass.weakMethod1(x, y);
		int expected = 5;
		
		assertEquals(expected,result);
		
	}
}
