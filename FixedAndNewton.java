import java.util.*;
public class FixedAndNewton
{
	public static void main(String[] args)
	{
		double xf = 2;
		double xN = 2; 
		double errF = Math.abs(xf); 
		double errN = Math.abs(xN); 

		double range = .000000000000001;

		double[] fixed = new double[10];
		double[] newton = new double[10];

		//compute Fixed Point 
		for (int i = 0; i < fixed.length; i++)
		{
			double temp = xf; 
			xf = xf + (Math.exp(-xf) + 2*Math.cos(xf/2)); 
			errF = Math.abs(xf-temp); 
			fixed[i] = errF;
		}

		//compute Newtons Method
		for (int i = 0; i < newton.length; i++)
		{
			double temp = xN;  
			xN = xN - (Math.exp(-xN) + 2*Math.cos(xN/2))/(-Math.exp(-xN) - Math.sin(xN/2));
			errN = Math.abs(xN-temp); 
			newton[i] = errN;
		}

		System.out.println("Fixed Point Iteration: ");
		double fx = xf + (Math.exp(-xf) + 2*Math.cos(xf/2));
		System.out.println("x = " + xf);
		System.out.println("f(x) = " + fx);
		System.out.println("--------------------------------------------");
		
		System.out.println("Newtons Method: ");
		double fN = xN - (Math.exp(-xN) + 2*Math.cos(xN/2))/(-Math.exp(-xN) - Math.sin(xN/2));
		System.out.println("x = " + xN);
		System.out.println("f(x) = " + fN);
		System.out.println("--------------------------------------------");

		System.out.println("Fixed Err           		Newtons Err");
		for (int i = 0; i < fixed.length; i++)
		{
			System.out.println(fixed[i] + "		" + newton[i]);
		}

	}
}