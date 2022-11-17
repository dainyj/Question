package q2440_star3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = n; 0 < i && i < n + 1; i--) {
			for (int j = i; 0 < j && j < i + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
