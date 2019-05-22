package Level1;
/*Ugly numbers are numbers whose only prime factors are 2,3 or 5,
 * The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15*/
public class UglyNumbers {

	/*This function divides "a" by greatest divisible power of "b"*/
	static int maxDivide(int a, int b)
	{
		while(a%b == 0)
			a=a/b;
		return a;
	}
	/* Function to check if a number is ugly or not*/

	static int isUgly(int no)
	{
		no=maxDivide(no,2);
		no=maxDivide(no,3);
		no=maxDivide(no,5);
		return (no == 1)?1:0;//Conditional operator is also known as the ternary operator.
		//Goal of the operator is to decide, which value should be assigned to the variable.
		// Var x=(expression)? value if true: value if false
		//in above case if 1 is'true' and '0' is false.
	}
	/*Function to get the nth ugly number*/
	static int getNthUglyNo(int n)
	{
		int i=1;
		//Ugly Number Count
		int count=1;
		//check for all integers
		//untill count becomes n
		
	while(n>count)
	{
		i++;
		if(isUgly(i)==1)
			count++;
	}
	return i;
	}

/*Driver Program to test above function*/
public static void main(String args[])
{
	int no=getNthUglyNo(150);
	System.out.println("150th ugly"+" no. is"+" "+ no);
	}
}