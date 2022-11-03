package operator_Ex;
public class OperatorExample11 {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;
		long lz1 = (long)x * (long)y;    //1000000000000
		int lz11 = (int) ((long)x * (long)y);   //-727379968
		long lz12 = x * (long)y;     //1000000000000
		long lz13 = (long)x * y;     //1000000000000
		
		long lz2 = (long)(x * y);
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz11);
		System.out.println(lz12);
		System.out.println(lz13);
		System.out.println(lz2);
	}

}
