package Interview;
// Program to take input from user w-length of the string,x-total number of chars,y-number of numbers,z-number of spl chars and print string can be a palidrome or not
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class thoughtWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//madam
		//Ex: a1a, bc11cb, 00##00, abc$cba
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of string: ");  
		int w = sc.nextInt();
		Map<Character,Integer> values = new HashMap<Character,Integer>();
		
			System.out.print("Enter Total Number of character: ");  
			int x = sc.nextInt();
			values.put('x',4);
			System.out.print("Enter Total Number of numbers: ");  
			int y = sc.nextInt();
			values.put('y',2);
			System.out.print("Enter Total Number of sp char: ");  
			int z = sc.nextInt();
			values.put('z',0);
		
		
		
		Iterator<Entry<Character,Integer>> it = values.entrySet().iterator();
		int flag=0;
		while(it.hasNext())
		{
			//System.out.println(it.next());
			int i = it.next().getValue();
			
			if(i>0&&i%2!=0)
			{
				flag++;
			}
		}
		
		if(flag>1)
		{
			System.out.println("String can not be palidrome");
		}
		else
		{
			System.out.println("String can be palidrome");
		}

	}
	
	//a-z 4 aa bb
	//1-9 2 11

}
