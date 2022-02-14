package testPackage;

public class testPrime {
	
	public static void prime(int number)
	{
		for (int i=2;i<number;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
			if(i%j==0)
			{
				count++;
			}
			}
			if(count==0)
			{
				System.out.println(i+" ");
			}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testPrime.prime(100);
	}

}
