package testPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PrimeNum {
	
	public void totalPrime(int n,int m)
	{
		
	List<Integer> PrimeNo = new ArrayList<Integer>();
	int sum=0;
	for(int i=n;i<m;i++)
	{
		int flag=0;
		for(int j=2;j<i;j++)
		{
			if((i%j)==0)
					{
					flag=1;
					}
			
		}
		
		if(flag==0)
		{
			//System.out.println(i+" ");
			PrimeNo.add(i);
			sum= sum+i;
		}
	}
	
	System.out.println(PrimeNo);
	System.out.print(sum);

	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNum pn = new PrimeNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting range: \n");
		int n = sc.nextInt();
		System.out.println("Enter the Ending range:");
		int m = sc.nextInt(); 
		pn.totalPrime(n,m);
		
		}
	
	

}
