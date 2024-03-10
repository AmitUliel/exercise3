package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class WeakMethod2_a {
	@Test (expected = java.lang.ArithmeticException.class)
	public void test_2a()
	{
		int x = 2;
		int y = 4;
		
		WeakClass.weakMethod2(x,y);
	}
}
