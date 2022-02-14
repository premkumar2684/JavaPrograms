package Interview;
//program to remove duplicate values from list
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class removeDuplicateUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listWithDuplicates = List.of(5, 0, 3, 1, 2, 3, 0, 0);
		List<String> l = List.of("prem","Jash","prem");
	    List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));
	    List<String> s = new ArrayList<>(new HashSet<>(l));
	    System.out.println(listWithDuplicates);
	    System.out.println(listWithoutDuplicates);
	    System.out.println(l);
	    System.out.println(s);

	}

}
