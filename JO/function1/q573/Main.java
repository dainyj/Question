/*100 미만의 정수만 입력된다. 정수 n을 입력받아 n x n 크기의 숫자사각형을 출력하는 프로그램을 작성하시오.
이때 정수 n을 전달받아 숫자 정사각형을 출력하는 함수를 작성하고, 입력받은 정수 n을 함수로 전달하여 출력한다.
 입력 4
 출력
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

*/
package q573;

import java.util.Scanner;

public class Main {

	public void numr(int n) {
		for (int i = 0; i < n * n; i++) {
			if (i % n == 0) {
				System.out.println();
			}
			System.out.print(i + 1 + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
//		System.out.println(n);
		Main m = new Main();  //인스턴스화 레퍼런스 변수 m을 이용해서 Main클래스의 메서드 호출
		m.numr(n);                                                   //    <-
	}

}

//	n*n 사각형 출력