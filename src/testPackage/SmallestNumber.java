package testPackage;
import java.util.*;
public class SmallestNumber {
	
	// you can also use imports, for example:
	// import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");
	
	
	    public int solution(int[] A) {
	        // write your code in Java SE 8



	     int smallestInt = 1; 

	    if(A.length == 0) return smallestInt;

	    Arrays.sort(A);

	    if(A[0] > 1) return smallestInt;
	    if(A[ A.length - 1] <= 0 ) return smallestInt; 

	    for(int i = 0; i < A.length; i++){
	        if(A[i] == smallestInt){ 
	         smallestInt++;}    
	    }

	    return smallestInt;
	}
	
    
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmallestNumber sn = new SmallestNumber();
		int [] arr = {2,4,5,1,4};
		int smallnum = sn.solution(arr);
		System.out.print(smallnum);
		
	}

}
