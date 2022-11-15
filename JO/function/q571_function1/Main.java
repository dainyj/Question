package q571_function1;

import java.util.Scanner;

public class Main {
	public static void printStr() {
		System.out.println("~!@#$^&*()_+|");
	}   // printStr 선언부 6~7번라인

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 0; i < num; i++) {
			printStr();  // printStr 호출부
		}
	}
}
