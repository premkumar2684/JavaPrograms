package Interview;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
public class testInt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//12 65 77 80 12 65
		List<Integer> baseList = List.of(12,65,77,80,12,65);
		List<Integer> removeDuplicates = new ArrayList<Integer>();
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		//Collections.reverse(baseList);
		
		for(int i:baseList)
		{
			if(mp.containsKey(i))
			{
				mp.put(i,mp.get(i)+1);
				removeDuplicates.remove(removeDuplicates.indexOf(i));
			}
			else
			{
				mp.put(i,1);
				removeDuplicates.add(i);
			}
		}
		
		System.out.println(removeDuplicates);

		Iterator<Entry<Integer,Integer>> it = mp.entrySet().iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
