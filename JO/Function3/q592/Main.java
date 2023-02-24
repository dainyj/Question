/*9자리 이하의 자연수를 입력받아 재귀함수를 이용하여 각 자리 숫자의 제곱의 합을 출력하는 프로그램을 작성하시오.
( main()함수에 변수 하나, 재귀함수에 매개변수 하나만을 사용할 수 있다.)
*/
package q592;

import java.util.Scanner;

public class Main {

//	재귀함수
//	void method(int n) {
//		if (n == 0) {//n=0일때 메서드 종료
//			return;
//		}
//		System.out.println(n);
//		method(--n);// method(int n)호출
//	}

	public int method(int n) {
		int res = n % 10;
		if (n == 0) {
			return 0;
		} else {
			return res * res + method(n / 10);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

//		System.out.println(inp/10);
//		System.out.println(inp%10); //1의 자리 숫자 

		Main m = new Main();
		int res = m.method(inp);
		System.out.println(res);
	}

}
