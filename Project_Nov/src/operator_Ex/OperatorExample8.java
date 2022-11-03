package operator_Ex;
public class OperatorExample8 {
	public static void main(String[] args) {
		byte a = 10;
		int b = 5;
		int c = 7;
		double d = 4.8;
		
		int result1 = a + b;
		double result2 = c + d;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.printf("%.2f",result2);
//		소수점2째자리까지 float 타입
	}
}
