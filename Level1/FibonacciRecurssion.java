package Level1;
/*formula F(n)=F(n-1)+F(n-2)*/
public class FibonacciRecurssion {

	static int Fib(int n)
	{
		if(n<=1)
			return n;
		return Fib(n-1)+Fib(n-2);
	}
	public static void main(String args[])
	{
		int n=35;
		System.out.println(Fib(n));
	}
}
