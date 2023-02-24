/*1부터 전달받은 수까지의 합을 출력하는 함수를 작성하고 1000 이하의 자연수를 입력받아 
 * 작성한 함수로 전달하여 출력하는 프로그램을 작성하시오.
*/
package q171;

import java.util.Scanner;

public class Main {
	public void Add(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
//		System.out.println(inp);
		sc.close();
		Main m = new Main();
		m.Add(inp);

	}
}
