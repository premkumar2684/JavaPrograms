package InterviewTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class qualitest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1,2,3,4,5,6 d=2 output:3,4,5,6,1,2
		
		String str = "Hi How are you How is work How is place How was lunch";
		String [] words = str.split("\\W");
		System.out.println(words.length);
		Map<String,Integer> mp = new HashMap<String,Integer>();
		for(String i:words)
		{
			if(mp.containsKey(i))
			{
				mp.put(i,mp.get(i)+1);
			}
			else
			{
				mp.put(i,1);
			}
		}
		
		//System.out.println(mp);
		
		mp.forEach((k,v)-> System.out.println(k + "=" + v));
		
		
		

/*
		
		List<Integer> ls = new LinkedList<Integer>();
		int d=2;
		ls = List.of(1,2,3,4,5,6);
		
		//output:3,4,5,6,1,2
		while(d>0)
		{
			
		int i=0;		
		ls.remove(i);
		ls.add(ls.size()-1,i);		
		d--;
		}
		
		for(int i:ls)
		{
			System.out.println(i);
		}
		
		
	}
	*/
	}
}
