/*두 개의 음이 아닌 정수를 입력받아 큰 수의 제곱에서 작은 수의 제곱을 뺀 결과값을 
출력하는 프로그램을 작성하시오.
(두 정수를 전달받아 제곱의 차를 리턴하는 함수를 이용할 것)
입력 8 10   출력 36
*/
package q173;

import java.util.Scanner;

public class Main {
	private int inp1;
	private int inp2;

//	public Main() {
//	}
//
//	public Main(int inp1, int inp2) {
//		this.inp1 = inp1;
//		this.inp2 = inp2;
//	}

	public void scan() {
		Scanner sc = new Scanner(System.in);
		inp1 = sc.nextInt();
		inp2 = sc.nextInt();
		sc.close();
//		System.out.println(inp1 + " " + inp2);
	}

	public int print() {
		int calc = (inp1 * inp1) - (inp2 * inp2);
		System.out.println(Math.abs(calc));
		return calc;
	}

	public static void main(String[] args) { // 프로그램 시작점.
		Main m = new Main(); // Main클래스 인스턴스 생성.
		m.scan();
		m.print();
	}
}
