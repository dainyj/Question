/*년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
400으로 나누어떨어지면 윤년이다. 또는 4로 나누어떨어지고 100으로 나누어떨어지지 않으면 윤년이다. 나머지는 모두 평년이다.
입력 2008
출력 leap year
*/
package q122;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		if (year % 400 == 0) {
			System.out.println("leap year");
		} else if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("leap year");
			} else {
				System.out.println("common year");
			}
		} else {
			System.out.println("common year");
		}
	}

}
