package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod8 {
	
	@Test (expected = java.lang.ArithmeticException.class)
	public void test_4b()
	{
		int x = 0;
		int y = 9;
		
		WeakClass.weakMethod4(x, y);
	}
}
