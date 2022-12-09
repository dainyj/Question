/*문제3. 문자열을 입력받아 알파벳 문자만 모두 대문자로 출력하는 프로그램을 작성하시오. 문자열의 길이는 100이하이다.
 * 1988-Seoul-Olympic!!! */
package test2_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(str);
		for(int i=0; i<str.length();i++) {
			System.out.println(str);
		}
		
		
		
		
//		System.out.print(str.charAt(5));
//		str = str.toUpperCase();
//		System.out.print(str.substring(5,10));
//		System.out.print(str.substring(11,18));
	} // main end
}

