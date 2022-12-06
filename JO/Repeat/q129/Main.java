/*삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서
 *  하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 
 *  다른 문자이면 종료하는 프로그램을 작성하시오.
(넓이는 반올림하여 소수 첫째자리까지 출력한다.)​

*/
package q129;

import java.util.Scanner;

// 1.Main class외 다른 class를 추가
class Semo {
	private int b;
	private int h;

	Scanner sc = new Scanner(System.in);

	public void base() {
		b = sc.nextInt();
	}

	public void height() {
		h = sc.nextInt();
	}

	public double print() {
		double w = (double) (b * h) / 2;
		System.out.print(w);
		return w;
	}

	public boolean c() {
		char c = sc.next().charAt(0);
		boolean res = c == 'Y' || c == 'y';
		return res;
	}
}//

public class Main {
	public static void main(String[] args) {
		Semo s = new Semo();

		do {
			System.out.print("Base = ");
			s.base();
			System.out.print("Height = ");
			s.height();
			System.out.print("Triangle width = ");
			s.print();
			System.out.println();
			System.out.print("Continue? ");
		} while (s.c());
	}
}

// 2.클래스 안에 메서드 추가
//----------------------------------------------
//public class Main {
//	public double calc(int a, int b) {
//		double w = (double) (a * b) / 2;
//		System.out.println(w);
//		return w;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char c = '\0';
//		for (;;) {
//			System.out.print("Base = ");
//			int b = sc.nextInt();
//			System.out.print("Height = ");
//			int h = sc.nextInt();
//
//			System.out.print("Triangle width = ");
//			Main m = new Main();
//			m.calc(b, h);
//
//			System.out.print("Continue? ");
//			c = sc.next().charAt(0);
////		System.out.print(c);
//			if (!(c == 'Y' || c == 'y')) {
//				sc.close();
//				break;
//			}
//		}
//	}//
//}

// 3.main메서드 안에서
//----------------------------------------------------
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		while(true) {
//			System.out.print("Base = ");
//			int b = sc.nextInt();
//			System.out.print("Height = ");
//			int h = sc.nextInt();
//			double w = (double) (b * h) / 2;
//			System.out.println("Triangle width = " + w);
//			System.out.print("Continue?");
//			
//			char c = sc.next().charAt(0);
//			if (!(c == 'Y' || c == 'y')) {
//				sc.close();
//				break;
//			}
//		}
//	}//
//}
