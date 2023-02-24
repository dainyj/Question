/*반지름의 길이를 전달받아 넓이를 출력하는 함수를 작성하고 반지름의 길이를 입력받아 함수를 호출하여 넓이를 출력하는 프로그램을 작성하시오.
단, 원주율(π)은 3.14로 하고 반올림하여 소수 둘째자리까지 출력한다. 
원의 넓이 = 반지름(r) * 반지름(r)​ * 원주율(π)​이다.
입력 10
출력 314.00
*/

package q572;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	double c = 3.14;

	public void r() {
		double ca = c * num * num;
		System.out.printf("%.2f", ca);
		sc.close();
	}

	public static void main(String[] args) {
		Main m = new Main();
		{
			m.r();
		}
	}

}

//		>넓이를 출력하는 함수
//		>(입력받을 r ^2)*3.14