package q529;

import java.util.Scanner;

public class Ex529_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();

		int bmi = w + 100 - h;
		System.out.println(bmi);

		if (bmi > 0) {
			System.out.println("Obesity");
		}

	}

}
