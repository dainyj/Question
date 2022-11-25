/*두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
입력 50 85
출력 35
*/

package q120;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();

		if (i1 > i2) {
			System.out.println(i1 - i2);
		} else {
			System.out.println(i2 - i1);
		}
	}

}
