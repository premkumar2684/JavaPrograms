package testPackage;

public class FactorialExample2 {
	
	static int factorial(int n)
	{
		if (n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=4,fact=1;
		fact = factorial(n);
		System.out.print(fact);
		

	}

}
