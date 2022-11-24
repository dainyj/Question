/*서로 다른 두 개의 정수가 주어진다.
두 정수를 입력받아 큰 수는 2로 나눈 몫을 저장하고 작은 수는 2를 곱하여 저장한 후 출력하는 프로그램을 작성하시오.
(참조에 의한 호출을 이용한 함수를 작성하여 값을 수정하고 출력은 메인함수에서 한다.)
입력 100 500
출력 200 250*/
package q577;

import java.util.Scanner;

public class Main {
	private int n1;
	private int n2;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		sc.close();
//		System.out.print(n1 + " " + n2);
	}
	
	public void calcprint() {
		if (n1 > n2) {
			int res1 = n1 / 2;
			int res2 = n2 * 2;
			System.out.println(res1 + " " + res2);
		} else {
			int res1 = n1 * 2;
			int res2 = n2 / 2;
			System.out.println(res1 + " " + res2);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.input();
		m.calcprint();
	}
}
