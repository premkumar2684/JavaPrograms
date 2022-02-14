package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class gainSight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Copy list into another array list
		List<Integer> baseList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		//List<Integer> ls= new ArrayList<Integer>();
		//List<Integer> ReverseList= new ArrayList<Integer>();
		Collections.reverse(baseList);
		System.out.println(baseList);
		List<Integer> b = new ArrayList<Integer>();
		b=List.of(1,2,3);
		Collections.reverse(b);
		System.out.println(b);
		
		
	
		
		
	}

}
