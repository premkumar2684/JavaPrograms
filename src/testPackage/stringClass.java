package testPackage;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "prem";
		s.concat("kumar");
		System.out.println(s);/// It will still print prem as String s is immutable and final
		String p = s.concat("kumar d");
		System.out.print(p);

	}

}
