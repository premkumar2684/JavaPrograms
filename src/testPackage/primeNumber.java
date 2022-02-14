package testPackage;

public class primeNumber {
	
	public void Prime(int n,int m)
	{
		for(int i=n;i<m;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(i+" ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		primeNumber pn = new primeNumber();
		pn.Prime(2,10);
	}

}
