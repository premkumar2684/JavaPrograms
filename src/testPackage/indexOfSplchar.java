
//Write a dynamic java program to find sum of the index number of all special characters present in the string.



//Input-1: Mango@Banana#Apple$Grapes%
//Output-1: [5, 12, 18, 25] => 60
package testPackage;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class indexOfSplchar {
	
	
	public void indexofsplchar(String input)
	{
		
		
		List<Integer> index = new ArrayList<Integer>();
		int sum=0;
		
				
	for(int i=0;i<input.length();i++)
	{
		char letter = input.charAt(i);
		//System.out.println(letter);
		//if((!letter.isDigit)&&(!letter.isLetter)&&(!letter.isWhitespace))
		if(!Character.isDigit(letter)&&!Character.isLetter(letter)&&!Character.isWhitespace(letter))
		//if(letter!=[a-z]||letter!=[A-Z]||letter!=[0-9]||letter!=" ")
		{
			index.add(i);
			sum=sum+i;
		}
		
		
	}
	System.out.println(index);
	System.out.print(sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		indexOfSplchar ip = new indexOfSplchar();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		ip.indexofsplchar(str);


	}

}
