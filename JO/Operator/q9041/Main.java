/*점수를 입력받아 80점 이상이면 합격메시지를 그렇지 않으면 불합격 메시지를 
 * 출력하는 작업을 반복하다가 0~100점 이외의 점수가 입력되면 종료하는 프로그램을 작성하시오.
출력 
점수를 입력하세요. 50
죄송합니다. 불합격입니다.
점수를 입력하세요. 95
축하합니다. 합격입니다.
점수를 입력하세요. 101
*/
package q9041;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.print("점수를 입력하세요. ");
			num = sc.nextInt();
			if (num >= 80 && num < 101) {
				System.out.println("축하합니다. 합격입니다.");

			} else if (num < 80) {
				System.out.println("죄송합니다. 불합격입니다.");
			}
		} while (num >= 0 && num <= 100);
		sc.close();
	}
}