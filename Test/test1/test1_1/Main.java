package test1_1;
/* 1. 두 개의 정수를 입력 받아 곱과 몫을 출력하시오. */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		int res1 = n1 * n2;
		int res2 = n1 / n2;

		System.out.println(n1 + " * " + n2 + " = " + res1);
		System.out.println(n1 + " / " + n2 + " = " + res2);

	} // main end
}
