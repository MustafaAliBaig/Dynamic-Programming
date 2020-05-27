package Level1;

public class MaxValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*This is the program to write maximum value in an array 
		 * Program is updated with second highest value
		 * here First Highest is Max=95
		 * Second Highest is Max2=86
		 * */
		
		int[] A= {10,70,4,86,7,95,56};
		
		//int max=Integer.MIN_VALUE;
		int max=A[0];
		int max2=A[0];

		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max  )
			{
				 //if(max2<max)
			//{				
				max2=max;
			//}
			max=A[i];
		}
		}
		System.out.println("Maximum Value is "+max);

		System.out.println(" Second Maximum Value is "+max2);
		

	}


}
