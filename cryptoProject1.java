import java.util.*;

public class cryptoProject1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] b = {2, 3, 5, 7, 11, 13, 17, 19, 23}; 
		int[] xs = new int[b.length+1]; //the x values
		int[] as = new int[b.length+1]; //the a values
		int[] temps = new int[b.length]; //the 
		int[][] factors = new int[b.length+1][b.length]; 
		int x = (int) Math.ceil(Math.sqrt(n)); 
		int x2 = x*x; 

		int a = (x2 - n) % n; 

		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				factors[i][j] = 0; 
			}
		}

		for (int i = 0; i < temps.length; i++)
		{
			temps[i] = 0; 
		}

		int i = 0; 
		while (i < xs.length)
		{
			int c = a; 
			for (int j = 0; j < b.length; j++)
			{
				if (c%b[j] == 0)
				{
					//System.out.println(c);
					c = c/b[j]; 
					temps[j]++;
					j = 0;
				}
			}
			if (c == 1)
			{
				xs[i] = x;
				as[i] = a;   
				for (int k = 0; k < b.length; k++)
				{
					factors[i][k] = temps[k];  
				}
				i++;
			}
			for (int j = 0; j < temps.length; j++)
			{
				temps[j] = 0; 
			}
			x++;
			x2 = x*x; 
			a = (x2 - n) % n;
		}

		for (int j = 0; j < temps.length; j++)
		{
			//System.out.print(b[j] + " "); 
			//System.out.println(xs[j]); 
		}
		System.out.println();
		for (i = 0; i < b.length+1; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				//System.out.print(factors[i][j] + " ");
			}
			//System.out.println();
		}

		for (int j = 0; j < temps.length+1; j++)
		{
			System.out.println(as[j]); 
			System.out.println(xs[j]); 
		}
	}
}