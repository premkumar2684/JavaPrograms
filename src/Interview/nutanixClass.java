package Interview;

public class nutanixClass {
	

static int mrec(int a,int b)
{
    while(b>1)
    {
    	 return a+mrec(a,b-1);
    }

   
	return a;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= mrec(4,4);
		System.out.print(num);
	}

}
