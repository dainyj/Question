/* 출력 형식
1 1 1    1 2 3    1 2 3 
2 2 2    3 2 1    2 4 6
3 3 3    1 2 3    3 6 9
*/

package q2046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
//		System.out.println(n + " " + m);

		// 종류 1
		switch (m) {
		case 1:
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			} // 종류1 끝
			break;
		case 2:
			// 종류 2
			for (int k = 1; k <= n / 2; k++) {
				for (int i = 1; i <= n; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				for (int i = n; i > 0; i--) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			break;
//		종류 3
		case 3:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(i * j + " ");
				}
				System.out.println();
			}
			break;
		}
	} // main end
}
