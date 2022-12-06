package q561_array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");
		}
		int max = 0;
		int min = 10000;

		for (int i = 0; i < num.length; i++) {
			if (max < num[i] && num[i] < 100) {
//				System.out.print(num[i] + " ");
				max = num[i];
			}

			if (min > num[i] && num[i] >= 100) {
//				System.out.print(num[i] + " ");
				min = num[i];

			}
		} // for end.
		if (max == 0) {
			max = 100;
		}
		if (min == 10000) {
			min = 100;
		}
		System.out.print(max + " " + min);

//		}
	}// main end.

}
//  29~33열의 위치를 못잡아서 통과가 안됐음.