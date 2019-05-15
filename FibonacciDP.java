//Fibonacci series using Dynamic programming
public class FibonacciDP {
	static int Fib(int n)
	{
		/*Declare an array to store fibonnaci numbers.*/
		int f[]= new int[n+2];//1 extra to handle case, n=0;
		int i;
		
		/*0th and 1st number of the series are 0 and 1*/
		f[0]=0;
		f[1]=1;
		for (i=2;i<=n;i++)
		{
			/*Add the previous 2 Numbers in the series and store it*/
			f[i]=f[i-1]+f[i-2];
			System.out.println("Array storage for i"+ f[i]);
			
		}
		//System.out.println("Array storage for n"+ f[n]);
		return f[n];
		
	}
	public static void main(String args[])
	{
		int n=9;
		System.out.println(Fib(n));
	}

}
