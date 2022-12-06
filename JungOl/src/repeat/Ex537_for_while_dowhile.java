package repeat;

import java.util.Scanner;

public class Ex537_for_while_dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		System.out.println(inp);

		int sum = 0;

// for문
		for (int i = 0; i <= inp; i++) {
			sum = sum + i; // sum +=i;
		}
		System.out.println(sum);

// while문
		int sum1 = 0, j = 1;
		while (j <= inp) {
			sum1 += j++;
//			sum1 +=j;	// sum1 = sum1 + j;
//			j++;
		}
		System.out.println(sum1);

// do while문
		int sum2 = 0, k = 1;
		do {
			sum2 += k++;
		} while (k <= inp);
		System.out.println(sum2);

	}
}
