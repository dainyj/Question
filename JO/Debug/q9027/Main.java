/*실수형 변수 두 개를 입력받아서 두 수의 합을 정수로 변환한 결과값과 두 수를 각각 정수로 변환하여
합을 구한 결과값을 출력하는 프로그램을 작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오. 
입력 3.4 5.65  출력 9 8
*/
package q9027;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp1 = sc.nextDouble();
		double inp2 = sc.nextDouble();
		sc.close();
		System.out.println(inp1 + " " + inp2);

//------Math.rint(); 사용해봄.-------------------------------------
		double num1 = Math.rint(inp1);
		double num2 = Math.rint(inp2);
		System.out.println(num1 + " " + num2);
//--------------------------------------------개인적으로 시도해본것.--

//		1. 실수 합을 계산 -> 정수로
		double res = inp1 + inp2;
		int res1 = (int) res;
		System.out.print(res1 + " ");
//		2. 입력값을 정수로 -> 합 구하기
		int inp3 = (int) inp1;
		int inp4 = (int) inp2;
		int res2 = inp3 + inp4;
		System.out.println(res2);

	}
}
