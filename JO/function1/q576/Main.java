/*정수의 연산식을 입력받아 연산을 위한 함수를 호출하여
4칙연산(+ - * /)의 연산결과를 출력하는 프로그램을 작성하시오.
('/'의 경우는 정수 부분만 출력하고 4칙연산 이외의 연산 결과는 0으로 한다.)
( if_else 문으로 작성하세요.)
입력  10 + 20
출력
10 + 20 = 30
*/

// 스캐너도 메서드로 만들어서 사용하는것으로 다시 작성해보기
package q576;

import java.util.Scanner;

public class Main {

	public void calculator(int n1, char ch, int n2) {

		if (ch == '+') {
			int res1 = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + res1);
		} else if (ch == '-') {
			int res2 = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + res2);
		} else if (ch == '*') {
			int res3 = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + res3);
		} else if (ch == '/') {
			int res4 = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + res4);
		} else {
			System.out.println(n1 + " ^ " + n2 + " = " + 0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		char c = sc.next().charAt(0);
		int num2 = sc.nextInt();
		sc.close();

		Main m = new Main();
		m.calculator(num1, c, num2);
	}// main end
}
