package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {

	// i need to know when i find the error what should i return ?
	public static String weakMethod1(int x, int y) throws ArithmeticException{
		x -= 1;
		y -= 1;
		
		if (x == 0 || y == 0) 
		{
			
			y /= x;
			return Integer.toString(y);
		}

		else 
		{
			return Integer.toString(y+2);
		}
	}

	public static String weakMethod2(int x, int y) {
		x -= 1;
		y -= 1;

		if (x == 0 || y == 0) {
			if (x == 0)
			{
				try {
					return Integer.toString((y/x)+2);
				}
				catch(ArithmeticException e) {
					
					return "Can't divide by 0";
				}
			}

			y /= x;
			return Integer.toString(y);
		}

		else {
			return Integer.toString(y+2);
		}
	}
	
	public static String weakMethod3(int x, int y) {
		
		if(y%2 == 0)
		{
			x -= 1;
			y += 1;
		}
		return Integer.toString(y/x);
	}
}
