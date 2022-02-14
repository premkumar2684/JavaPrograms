/* 2. Write a dynamic java program to find the prime numbers and its count present in the given range of numbers.

Input-1:
Enter the starting number from the range: 1
Enter the ending number from the range: 100

Output-1:
All prime numbers from '1' to '100' are: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
Total prime numbers from '1' to '100' are: 25

*/
package testPackage;

import java.util.Arrays;

public class smallestMissingInt {
	
	public int Solution(int [] A)
	{
		int smallestInt=1;
		
		Arrays.sort(A);
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
		if (A[0]>1)
		return smallestInt;
		
		if(A[A.length-1]<0)
		return smallestInt;
		for(int i=0;i<A.length;i++)
		{
			if(smallestInt==A[i])
			{
				smallestInt++;
			}
			
		}
		return smallestInt;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		smallestMissingInt sm = new smallestMissingInt();
		//int A [] = new int[] {2,3,4,1,5,8};
		int [] A= {2,3,4,1,5,8};
		int smallestMissing=sm.Solution(A);
		System.out.print(smallestMissing);

	}

}
