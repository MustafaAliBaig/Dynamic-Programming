package Level1;

public class MaxValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*This is the program to write maximum value in an array */
		
		int[] A= {10,2,4,6,7,95,56};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
				System.out.println("Maximum Value is "+max);
			}
		}
		
		

	}

}
