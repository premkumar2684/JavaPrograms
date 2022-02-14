package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//12 65 77 80 12 65
		String str = "I am in Interview";
		
		//StringBuilder str1= new StringBuilder();
		
		//str1= str.split(' ');
		String [] str1= str.split("\\W");
		
		for(String i:str1)
		{
		
		System.out.print(i);
		
		}
		
		
	}
	
	
}
