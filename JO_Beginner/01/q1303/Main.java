package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
//		System.out.print(n + " " + m);

		for (int i = 1; i <= n * m; i++) {
			System.out.print(i + " ");
			if (i % m == 0) {
				System.out.println();
			}
		}
	}
}
