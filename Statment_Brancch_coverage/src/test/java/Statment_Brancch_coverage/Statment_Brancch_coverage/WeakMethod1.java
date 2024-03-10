package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class WeakMethod1 {
	
	@Test (expected = java.lang.ArithmeticException.class)
	public void test_1a()
	{
		int x = 1;
		int y = 2;
		
		WeakClass.weakMethod1(x,y);
	}
}
