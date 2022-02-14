package testPackage;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.function.Supplier;

public class GFG {
	public static void main(String args[])
	{

		// For ArrayList
		List<String> list = new ArrayList<String>();
		list.add("test");
		list.add("new");
		list.add("test");
		//System.out.println("ArrayList : " + list);
		
		Iterator<String> itrl = list.iterator();
		while(itrl.hasNext())
		{
			System.out.println(itrl.next());
		}

		// For LinkedList
		List<Integer> llist = new LinkedList<Integer>();
		llist.add(2);
		llist.add(4);
		System.out.println("LinkedList : " + llist.toString());

		// For Stack
		List<Integer> stack = new Stack<Integer>();
		stack.add(3);
		stack.add(1);
		System.out.println("Stack : " + stack.toString());
		
		// for set
		Set <Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1);
		System.out.print("set:"+set1);
		
		//For Map
		Map <Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Prem");
		hm.put(2,"Jash");
		hm.put(3,"prem");
		for(Entry<Integer, String> me : hm.entrySet())
		{
			System.out.println();
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		Iterator<Entry<Integer,String>> itr = hm.entrySet().iterator();
		
		while (itr.hasNext()) {
		    System.out.println(itr.next());
		}
		

	}
}
