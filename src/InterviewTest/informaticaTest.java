package InterviewTest;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class informaticaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s =  "abcababcd";
		
		String test = "abc";
		test =test.substring(4);
		System.out.println(test);
//bbbbb

		//s.split(s);
		char [] ch = s.toCharArray();
		
		/*	for(int i=0;i<ch.length;i++)
		{
			for(int j=i;j<ch.length;j++)
			{
				
			}
		}*/
		List<Integer> l = new ArrayList<Integer>();
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		Iterator<Entry<Character,Integer>> itr = mp.entrySet().iterator();
		int count =0;
		for(char i:ch)
		{
			if(mp.containsKey(i))
			{
				//count=0;
				while(itr.hasNext())
				{
					mp.remove(itr);
					
				}
				break;
				
				
			}
			else
			{
				mp.put(i,1);
				count++;
			}
			
			
		}
		l.add(count);
		
		System.out.println(count);
		
		System.out.println(Collections.max(l));
		for(int i:l)
		{
			System.out.println(i);
		}
/*		
*/
	}

}
