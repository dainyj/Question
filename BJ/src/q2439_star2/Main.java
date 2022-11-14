package q2439_star2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

//		for (int i = 0; i < num; i++) {
//			for (int j = 1; j < num - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//실패
		for (int i = 0; i <=num ; i++) {
			System.out.println(i);
			for (int j = num-i; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println();
			for (int j = 0; j <= i; j++) {
			System.out.print("*");
			}

		}
	}
}
