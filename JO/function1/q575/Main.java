package q575;
/*10 이하의 두 정수가 주어진다.

이를 입력 받아서 첫 번째 수를 두 번째 수만큼 거듭제곱하여 나온 값을 리턴하는 함수를 작성하여 

다음과 같이 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Main {
	public void calc(int num1, int num2) {
		int res = 1;
		for (int i = 0; i < num2; i++) {
			res *= num1;
		}
		System.out.println(res);
//		double res1 = Math.pow(n1, n2);  //제곱 구하기
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		Main m = new Main();
		m.calc(n1, n2);
	} // main end
}
