package q597;
/*두 개의 문자열을 입력받아서 두 문자열의 길이의 합을 출력하는 프로그램을 작성하시오.
각 문자열의 길이는 20자 미만이다.*/

/* 입력 
 Korean
 English*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lang1 = new String();
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			lang1 = sc.next();
//			System.out.print(lang1+" ");
//			System.out.print(lang1.length());
			sum += lang1.length();
		}
		sc.close();

		System.out.println(sum);

	} // Main end

}
