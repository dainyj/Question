/*0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
*/
package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[50];

//		inp[i] 배열 입력
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
//			System.out.print(inp[i]+" ");
			if (inp[i] == 0) {
				break;
			}
		}
		sc.close();
		int count = 0;
		for (int i = 0; i < inp.length; i++) {
			if (inp[i] % 3 == 0 || inp[i] % 5 == 0) {
				count++;
			}
		}
//		System.out.print(count + " ");
		System.out.println(inp.length - count);

	} //
}
