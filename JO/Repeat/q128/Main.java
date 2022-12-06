/*0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
*/
package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for문 사용
		int count = 0;
		for (;;) {
			int inp = sc.nextInt();
			if (inp == 0) {
				break;
			}
			if (inp % 3 != 0 && inp % 5 != 0) {
				count++;
			}
		}
//		do while문 사용
		int cnt = 0;
		do {
			int inp = sc.nextInt();
			if (inp == 0) {
				break;
			} else if (inp % 3 != 0 && inp % 5 != 0) {
				cnt++;
			}
		} while (true);
		sc.close();
		
		System.out.println(count);
		System.out.println(cnt);

	} //
}
