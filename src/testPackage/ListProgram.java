package testPackage;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		
		Iterator<Integer> it = l1.iterator(); 
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
