package Level1;
/*In mathematics binomial coefficient are the positive numbers which occur in the binomial theorem 
 * A binomial coefficient C(n, k) can be defined as the coefficient of X^k in the expansion of (1 + X)^n.
 * (1+x)^4=(4,0)x^0+(4,1)x^1+(4,2)x^2+(4,3)x^3+(4,4)x^4
 * (1+x)^4=1+4x+6x^2+4x^3+x^4*/
/*Optimal Structure
 *  C(n, k) = C(n-1, k-1) + C(n-1, k)
   C(n, 0) = C(n, n) = 1
 * */
import java.util.*;
public class BinomialCoefficient {
	//Return the value of binomial
	//coefficient C(n,k)
	
	static int binomialcoeff(int n, int k)
	{
		//Base Cases
		if(k==0 || k==n)
			return 1;
		//recursive
		return binomialcoeff(n-1,k-1)+binomialcoeff(n-1,k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5, k = 2; 
	        System.out.printf("Value of C(%d, %d) is %d ", 
	                        n, k, binomialcoeff(n, k)); 

	}

}
