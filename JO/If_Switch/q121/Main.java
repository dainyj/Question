/*정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
입력 0 출력 zero
*/package q121;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num == 0) {
			System.out.println("zero");
		} else if (num > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
	}

}
