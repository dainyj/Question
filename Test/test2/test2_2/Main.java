/*문제2. 100개의 정수를 저장할 수 있는 배열을 선언하고 
 * 정수를 차례로 입력받다가 0이 입력되면 0을 제외하고 
 * 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.*/
package test2_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		
//		내가 푼 방법
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
////			System.out.print(num[i] + " ");
//			if (num[i] == 0) {
//				while (true) {
//					System.out.print(num[(i-- - 1)] + " ");
//					if (i == 0) {
//						break;
//					}
//				}
//			}
//		}

//		선생님이 푼 방법
		int i = 0;
		while (true) {
			num[i] = sc.nextInt();
			if (num[i] == 0)
				break;
			i = i + 1;
		}
		sc.close();

		for (int j = i - 1; j >= 0; j--) {
			System.out.print(num[j] + " ");
		}

	} // main end
}
