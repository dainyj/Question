package q578;

import java.util.Scanner;

class Multip {
	private int inp1;
	private int inp2;

	public void input() {
		Scanner sc = new Scanner(System.in);
		inp1 = sc.nextInt();
		inp2 = sc.nextInt();
		sc.close();
//		System.out.println(inp1 + " " + inp2);
	}

	public void swap() {
		// 1. swap (작은 수가 앞으로 정렬.)
		if (inp1 > inp2) {
			int tmp = inp1;
			inp1 = inp2;
			inp2 = tmp;
		}
	}

	public void print() {
		// 2. print
		for (int i = inp1; i <= inp2; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = ");
				System.out.printf("%2d\n", i * j);
			}
			System.out.println();
		}
	}

}// Multip end

public class Tanswer {
	public static void main(String[] args) {
		Multip mp = new Multip();
		mp.input();
		mp.swap();
		mp.print();

	}// main end
}

//	************** class 따로 만들기 전 ******************************
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		sc.close();
//		System.out.println(n1 + " " + n2);
//
////		1.swap (작은 수가 앞으로 정렬.)
//		if (n1 > n2) {
//			int tmp = n1;
//			n1 = n2;
//			n2 = tmp;
//		}
//		System.out.println(n1 + " " + n2);
//		System.out.println();
//		
////		2.print
//		for(int i=n1;i<=n2;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %2d\n", i, j, i * j);
//			}
//			System.out.println();
//		}
//	}//
//}
