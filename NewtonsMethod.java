import java.util.*;
public class NewtonsMethod
{
	public static void main(String[] args)
	{
		double xN = 2; 
		double errN = Math.abs(xN); 

		double range = .000000000000001;
		int i = 0;  

		//compute Newtons Method
		while (errN > range)
		{
			double temp = xN;  
			xN = xN - (Math.exp(-xN) + 2*Math.cos(xN/2))/(-Math.exp(-xN) - Math.sin(xN/2));
			errN = Math.abs(xN-temp); 
			i++;
		}


		double fN = xN - (Math.exp(-xN) + 2*Math.cos(xN/2))/(-Math.exp(-xN) - Math.sin(xN/2));
		System.out.println("x = " + xN);
		System.out.println("f(x) = " + fN);
		System.out.println("The number of iterations was: " + i);
	}
}