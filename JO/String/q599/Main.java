package String.q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
//		System.out.println(str);
//		System.out.println(str.length());

//		방법1
		for (int i = 0; i < str.length(); i++) {
//			System.out.print(str.charAt(i) + " ");
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
//				System.out.print(str.charAt(i));
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
//				System.out.print((char) (str.charAt(i) - 32));
			}

//			방법2
//			알파벳만 뽑아내는 메서드
			if (Character.isAlphabetic(str.charAt(i))) { //알파벳만 골라주는 메서드
				str = str.toUpperCase(); // 대문자로 변경해주는 메서드
				System.out.print(str.charAt(i));

			}
		}

	} // main end
}

//			System.out.print(str.substring(5,10));
//			System.out.print(str.substring(11,18));
