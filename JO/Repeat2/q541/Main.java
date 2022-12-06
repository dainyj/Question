/*문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.
*/
package q541;

import java.util.Scanner;

public class Main {
	public Main(int n) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		
//		do while문
		int cnt = 1;
		do {
			System.out.print(c);
		} while (cnt++ < n);
		
		System.out.println();
		
//		for문
		for (int i=0;i<n;i++) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		Main m = new Main(20);
	}
}
