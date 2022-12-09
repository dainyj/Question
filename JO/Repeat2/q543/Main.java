/*하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오.
입력되는 정수는 50이하이다.
*/
package q543;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 정수 입력
		int inp = sc.nextInt();
		sc.close();

//-for-----------------------------------------
		int i = 1;
		for (i = 1; i <= inp; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

//-while---------------------------------------
		int j = 1;
		while (true) {
			j++;
			if (j % 2 == 0) {
				System.out.print(j + " ");
			} else if (j > inp - 1) {
				break;
			}
		}
		System.out.println();

//-do-while------------------------------------
		int k = 0;
		do {
			k++;
			if (k % 2 == 0) {
				System.out.print(k + " ");
			}
		} while (k < inp);
	}//
}
