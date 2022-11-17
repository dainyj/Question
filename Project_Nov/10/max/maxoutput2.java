package max;

import java.util.Scanner;

public class maxoutput2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		boolean[] chk = new boolean[6];

//입력값 확인
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			System.out.print(num[i] + " ");
		}
		sc.close();

		System.out.println();

		for (int i = 0; i < num.length; i++) {
			int max = Integer.MIN_VALUE;

			for (int j = 0; j < num.length; j++) {
				if (max < num[j] && chk[j] == false) {
					max = num[j];
				}
			}
			for (int j = 0; j < num.length; j++) {
				if (max == num[j]) {
					chk[j] = true;
				}
			}

			for (int j = 0; j < num.length; j++) {
				System.out.printf(" %5d", num[j]);
//				System.out.println();
				System.out.printf(" %5b", chk[j]);
//				System.out.print(chk[j] + " ");

			}
			System.out.print(" max = " + max + "\n");
		}
	}

}
