package InterviewTest;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class logMetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "bba";
		//StringBuilder sb = new StringBuilder(str);
		//System.out.println(sb);		
		//CIVIC
		//aaaab		
		//int strLen = str.length();
		//int flag=0;
		char [] chr = str.toCharArray();
		Arrays.sort(chr);
		System.out.println(chr);
		
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		//List<Integer> l= new ArrayList<Integer>();
	
		for(char c:chr)
		{
			if(mp.containsKey(c))
				{
				mp.put(c,mp.get(c)+1);
				
				}
				
			else
			{
				mp.put(c,1);
			}
		}
		
		Iterator<Entry<Character,Integer>> it = mp.entrySet().iterator();
		//Iterator<Entry<Character,Integer>> it = mp.entrySet().iterator();
		int flag=0;
	/*	while(it.hasNext())
		{
			//System.out.println(it.next());
			System.out.println(it.next().getValue());
			
		}
		*/
		while(it.hasNext())
		{
			System.out.println("------");
			System.out.println(it.next());
			System.out.println("------");
			if((it.next().getValue())%2==1)
			{
				flag++;
				//System.out.println(it.next().getValue());
				//System.out.println(flag);
				
				
			}
			
			
		}
		
		//System.out.println(flag);
		if(flag>1)
		{
			System.out.println("Given String can not be palindrome");
		}
		else
		{
			System.out.println("Given String can be palindrome");
		}
		
		

}
}
