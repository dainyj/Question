/*정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
*/
package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
//		System.out.println();
//		System.out.println(n + " " + x);

//		배열입력
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
//			System.out.print(a[i] + " ");
		}
		sc.close();
//		System.out.println();

		for (int i = 0; i < a.length; i++) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
