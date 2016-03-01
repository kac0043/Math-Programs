import java.util.*;
public class BisectionMethod
{
	public static void main(String[] args)
	{
		double a = 1;
		double b = 4; 
		double x = (a+b)/2;

		double fa = a*a*a - a - 1; 
		double fb = b*b*b - b - 1;
		double fx = x*x*x - x - 1;

		double err = b-a; 
		double range = .0000000001;
		int i = 0;  

		while (err > range)
		{
			if (fa*fx < 0)
				b = x; 
			else 
				a = x; 

			x = (a+b)/2; 
			err = b-a; 

			fa = a*a*a - a - 1;
			fb = b*b*b - b - 1;
			fx = x*x*x - x - 1;

			i++; 
		}
		System.out.println("x = " + x);
		System.out.println("f(x) = " + fx);
		System.out.println("The number of iterations was: " + i);
	}
}