/*정사각형의 한 변의 길이 n을 입력받은 후 다음과 같은 문자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오.
*/
package q1307;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
//		System.out.println(inp);
		
//-----------------------새로운 방법으로 풀어야 함. 이 방법은 제한적
		
		int i = inp * inp;
		int cnt = 0;
		int n = 0;
		do {
//			91-x=65가 되어야함. x=26 
			int res =i - inp * n + 64;
			if(res>90) {
				res=res-26;
			}
//			System.out.print( res + " ");
			System.out.print((char)res + " ");
			n++;
			cnt++;
			if (cnt % inp == 0) {
				i--;
				n = 0;
				System.out.println();
			}

		} while (cnt != inp * inp && i > 0);

//		System.out.println((char) 90);
//		System.out.println((char) 65);
//		System.out.println(90 - 64);

	}
}
