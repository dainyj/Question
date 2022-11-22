package q122;

import java.util.Scanner;

public class Ex122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		if (year % 400 == 0) {
			System.out.println("leap year");
		} else if (year % 4 == 0) {
			if (year % 100 != 0) {
				System.out.println("leap year");
			} else {
				System.out.println("common year");
			}
		} else {
			System.out.println("common year");
		}
	}

}
