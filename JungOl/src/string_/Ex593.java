package string_;

import java.util.Scanner;

public class Ex593 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 방법3
//		int num3 = 0;
//		do {
//			System.out.print("ASCII code =? ");
//			num3 = sc.nextInt();
//			if (num3 < 33 || num3 > 127) {
//				break;
//			}
//			System.out.printf("%c\n", num3);
//		} while (33 <= num3 && num3 <= 127);
//		sc.close();

//  방법2 아직 실패 
//		int num2 = 0;
//		do {
//			System.out.print("ASCII code =? ");
//			num2 = sc.nextInt();
//			char b = (char) num2;
//			
//			if (num3 < 33 || num3 > 127) {//이 조건문을 추가해야 통과함.
//				break;
//				
//			System.out.println(b); // 출력 전에 범위 밖으로 빠져나가는 조건문을 만들어야 하는데 안해서 
//		} while (33 <= num2 && num2 <= 127);
//		sc.close();

// 방법1	
		for (;;) {
			System.out.print("ASCII code =? ");
			int num1 = sc.nextInt();
			if (33 <= num1 && num1 <= 127) {
				char a = (char) num1;
				System.out.println(a);
			} else {
				sc.close();
				break;
			}
		}
		}
	}
	
		

	


