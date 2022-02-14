package testPackage;

public class binaryGap2 {

	public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.print("Binary number for "+N+" is:");
        for (int j =  0; j <= binary.length()-1; j++) 
        {
            System.out.print(binary.charAt(j));
        }
        int count = 0;
        int tmpCount = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                if (i > 0 && binary.charAt(i - 1) == '1') {
                    tmpCount++;
                } else {
                    if (tmpCount > 0) tmpCount++;
                }
            } else if (binary.charAt(i) == '1') {
                if (tmpCount > 0 && tmpCount > count) {
                    count = tmpCount;
                }
                tmpCount = 0;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryGap2 bg = new binaryGap2();
		int count = bg.solution(1034);
		System.out.println("\n Binary gap :"+count);

	}

}
