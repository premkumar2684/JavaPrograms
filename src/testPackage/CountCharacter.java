package testPackage;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		String str="i am getting ready";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				count++;
		}
System.out.print(count);
	}

}
