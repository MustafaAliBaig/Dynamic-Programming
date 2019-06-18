package Level2;
/*Binomial coefficient are the positive integers that are coefficient in the binomial theorem
 * C(n,k)=C(n-1,k-1)+C(n-1,k);
 * C(n,0)=C(n,n)=1
 * */
import java.util.*;
public class BinomialCoefficient2 {
	
	static int BinomialCoeff(int n,int k)
	{
		int c[][]=new int[n+1][k+1];
		int i,j;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=min(i,k);j++)   /* min(i,k) function is relevant to inner for loop*/
			{
				if(j==0||j==i)
					c[i][j]=1;
				else
					c[i][j]=c[i-1][j-1]+c[i-1][j];
				
				}
		}
		return c[n][k];
	}
	/*Utility function that calculates minimum of two numbers */
	static int min(int a,int b)
	{
		return (a<b)?a:b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,k=2;
		System.out.println(+BinomialCoeff(n,k));

	}

}
