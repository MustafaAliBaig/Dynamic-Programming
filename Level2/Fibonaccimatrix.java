package Level2;
/*Using power of the matrix {{1,1},{1,0}}
 * This another O(n) which relies on the fact that if we n times multiply  the matrix
 * M={{1,1},{1.0}} to itself(in other words calculate power(M,n)), then we get the (n+1)th Fibonacci
 * number as the element at row and coloumn(0,0) in the resultant matrix*/


public class Fibonaccimatrix {
	static int fib(int n)
	{
		int F[][]=new int[][] {{1,1},{1,0}};
		if(n==0)
			return 0;
		power(F,n-1);
		return F[0][0];
	}
	/* Helper Function that multiplies 2 matrices F and M of size 2*2, and puts
	 * the multiplication result back to f[][]
	 */
	static void multiply(int F[][],int M[][])
	{
		int x=F[0][0]*M[0][0] + F[0][1]*M[1][0];
		int y=F[0][0]*M[0][1]+F[0][1]*M[1][1];
		int z=F[1][0]*M[0][0] + F[1][1]*M[1][0];
		int w=F[1][0]*M[0][1]+F[1][1]*M[1][1];
		
		F[0][0]=x;
		F[0][1]=y;
		F[1][0]=z;
		F[1][1]=w;
		
	}
	/*Helper Function that calculates F[][] raise to the power n and puts the 
	 * result in F[][]
	 * Note that this function is designed only for fib() and won't work as general power function*/
	
static void power(int F[][], int n)
{
	int i;
	int M[][]=new int[][] {{1,1},{1,0}};
	//n-1 times multiply the matrix to {{1,1},{1,0}}
	for(i=2;i<=n;i++)
	multiply(F,M);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=9;
System.out.println(fib(n));
	}

}
