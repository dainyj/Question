/*10 이하의 두 개의 양의 정수를 입력받아서 작은 수부터 큰 수까지의 구구단을 차례대로 출력하는 프로그램을 구조화하여 작성하시오.
입력 3 5*/
/*출력
== 3dan ==
3 * 1 =  3
3 * 2 =  6
3 * 3 =  9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27

== 4dan ==
4 * 1 =  4
4 * 2 =  8
4 * 3 = 12
 … 
5 * 8 = 40 
5 * 9 = 45*/
package q578;

import java.util.Scanner;

public class Main {

	public void mul(int num1, int num2) {
		int bn = 0;
		int sn = 0;
		if (num1 > num2) {
			bn = num1;
			sn = num2;
		} else if (num2 > num1) {
			bn = num2;
			sn = num1;
		}
		for (int i = sn; i <= bn; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		Main m = new Main();
		m.mul(n1, n2);

	} //
}

//	구구단 만들기
//		for (int i = n1; i <= n2; i++) {
//			System.out.println("== "+i+"dan ==");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//			System.out.println();
//		}