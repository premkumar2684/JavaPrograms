package InterviewTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi How are you How is work How is place How was lunch";
		String [] words = str.split("\\W");
		System.out.println(words.length);
		Map<String,Integer> mp = new HashMap<String,Integer>();
		Iterator<Entry<String,Integer>> it = mp.entrySet().iterator();
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
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
