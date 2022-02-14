package InterviewTest;

public class orcaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str="DOOD";
		int A [] = new int [5];
		int count=1;
		int i=0;
		while(count<10)
		{
			
			A[i]=1;
			i++;
			count++;
			System.out.println(A[i]);
		}
		char [] ch= str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int ij= ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);
		}
		if(str.length()==sb.length())
		{
			if(str.equalsIgnoreCase(sb.toString()))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not a Palindrome");
			}
		}

	}

}
