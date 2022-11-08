package string_;

import java.util.Scanner;

public class Ex558 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
//for do do while 암거나 무한루프 사용
		int i = 0;

//  방법1		
		do {
			num[i] = sc.nextInt();

		} while (num[i++] != 0);
		sc.close();

		for (int j = i - 2; j >= 0; j--) {
			System.out.print(num[j] + " ");
		}
		sc.close();

//	방법2
//		for (i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");
//
//			if (num[i] == 0) {
//				break;
//			}
//		}
//		System.out.println();
//		System.out.println("--------------");
//
//		for (int j = i - 1; j >= 0; j--) {
//			System.out.print(num[j] + " ");
//		}
//		sc.close();

	}

}
