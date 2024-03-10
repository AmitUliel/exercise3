package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass{

	public static int weakMethod1(int x, int y){
		if (x == 0 || y == 2) 
		{	
			x -= 1;		
			y /= x;
			
		}
		y+=10;
		return y;
		
	}

	public static int weakMethod2(int x, int y) 
	{	
		if (x > 0 || y < 0) 
		{
			x-=2;
			return y/x;
		}
		else
		{
			return x+y;
		}
	}
	
	public static int weakMethod3(int x, int y) {
		
		if(y%2 == 0)
		{
			y = y/x;
		}
		
		y += 1;	
		return y;
	}
	
	public static int weakMethod4(int x, int y) {
		
		if(y%2 == 0 || x%2 == 0)
		{
			y = y/x;
		}
		
		else
		{
			y = x/y;
		}
		
		y += 1;	
		return y;
	}
}
