import java.util.*;
public class FixedPoint
{
	public static void main(String[] args)
	{
		double xc = .5;

		double err = Math.abs(xc); 
		double range = .000000001; //.04166667
		int i = 0;  

		while (err > range)
		{
			double temp = xc; 
			xc = ((xc*xc)/6) + (xc/6) + (1/2);
			err = Math.abs(xc-temp); 
			i++;
		}

		double fx = (1/6)*xc*xc + (1/6)*xc + (1/2);
		System.out.println("x = " + xc);
		System.out.println("f(x) = " + xc);
		System.out.println("The number of iterations was: " + i);
	}
}