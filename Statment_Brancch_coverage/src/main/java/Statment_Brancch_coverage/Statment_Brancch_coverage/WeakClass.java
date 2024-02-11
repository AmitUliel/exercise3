package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	
	public static int weakMethod1(int x , int y) throws ArithmeticException
	{
		x -= 1;
		y -= 1;
		
		if(x==0 || y == 0)
		{
			if(x==0) throw new ArithmeticException("Can't divide by 0");
			
			y/=x;
			return y;
		}
		
		else
		{
			return y + 2;
		}
	}
	
	public static int weakMethod2(int x , int y) throws ArithmeticException
	{
		x -= 1;
		y -= 1;
		
		if(x==0 || y == 0)
		{
			if(x==0 && y >= 10) throw new ArithmeticException("Can't divide by 0");
			
			y/=x;
			return y;
		}
		
		else
		{
			return y + 2;
		}
	}
}
