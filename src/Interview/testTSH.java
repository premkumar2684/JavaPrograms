package Interview;

import java.util.HashMap;
import java.util.Map;

public class testTSH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List=["Bangalore","Hyderbad","World","Country"];
		String [] words = {"Bangalore","Hyderbad","World","Country"};
		int count =  words.length;
		char [] expectChar = words[0].toCharArray();
		Map<Character,Integer> mp = new HashMap<Character,Integer>();
		//Iterator<Entry<Character,Integer>> itr = mp.entrySet().iterator();
		for(String i: words)
		{
			char [] ch = i.toCharArray();
			for(char j:ch)
			{
				if(mp.containsKey(j))
				{
					mp.put(j,mp.get(j)+1);
				}
				else
				{
					mp.put(j,1);
				}
			}
		}
		
		System.out.println(mp);

	}

}
