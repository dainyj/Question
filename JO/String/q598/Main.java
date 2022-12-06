package q598;
/*문자를 입력받아 알파벳 문자인 경우에는 그대로 출력하고 숫자인 경우는 
 * 아스키코드값을 출력하는 작업을 반복하다가 기타의 문자가 입력되면 
 * 종료하는 프로그램을 작성하시오.*/

/*입력
A
A
1
49
@
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {

			char A = sc.next().charAt(0);
//			int N = sc.nextInt();
			if(0<A&&A<10)
//			System.out.println(A);
			System.out.printf("%c",A);
		}

//		sc.close();
	} // Main end

}
