package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod4_a {
	
	@Test 
	public void test_3a()
	{
		int x = 1;
		int y = 2;
		
		int result = WeakClass.weakMethod3(x, y);
		int expected = 3;
		
		assertEquals(expected, result);
	}
}
