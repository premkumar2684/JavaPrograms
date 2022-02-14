package testPackage;

public class coForge {
	
	
public void coforgemethod() {
	String[][] chs = new String[2][];
	chs[0] = new String[2];
	chs[1] = new String[5];
	int i = 97;
	System.out.println(chs.length);
	for(int a=0;a<chs.length;a++) {
	for(int bb=0;bb<chs.length;bb++) {
	chs[a][bb] = ""+i;
	System.out.println(chs[a][bb]);
	i++;
	}
	}

	for(String[] ch : chs) {
	for(String c : ch) {
	System.out.print(c+" ");
	}
	}	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coForge cf = new coForge();
				cf.coforgemethod();

	}

}
