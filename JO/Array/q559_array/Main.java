package q559_array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] score = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		// 배열 바로 초기화값 입력 방법

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		double sum = score[num1 - 1] + score[num2 - 1];

		System.out.printf("%.1f", sum);

	}

}
