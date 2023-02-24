//팩토리얼
package q1309;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(n);
		sc.close();
		long result = method(n);
		System.out.println(result);

	}//

	public static long method(int n) {
		if (n == 1) {
			System.out.println(n + "! = " + n);
			return 1;
		} else {
			System.out.printf("%d! = %d * %d!\n", n, n, n - 1);
			return  n * method(n - 1);
		}
	}
}

//		팩토리얼 계산
//		if(n==1)
//			result=1;
//		else
//			result = n*(n-1);
//		/* n=n*(n-1); */
//		System.out.println(result);

//		public void fac() {
//	}// fac end

/*
 * 재귀호출 void method(int n) {
 *  if(n==0) return; 
 *  System.out.println(n);
 * method(--n);
 */