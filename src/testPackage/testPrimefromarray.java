package testPackage;



public class testPrimefromarray {
	
	public void testPrime(int [] arr)
	{
		for(int i:arr)
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
				System.out.println(i+" Is prime");
			}
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrint = {1,2,3,4,5,6};
		for(int i=0;i<arrint.length;i++)
		{
			System.out.println(arrint[i]);
		}
		testPrimefromarray tp = new testPrimefromarray();
		tp.testPrime(arrint);
		
		
		
		
		

	}

}
