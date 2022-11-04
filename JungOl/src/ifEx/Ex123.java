package ifEx;

import java.util.Scanner;

public class Ex123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number? ");
		int num = sc.nextInt();
		System.out.print("Number? ");
		int num2 = sc.nextInt();
		sc.close();

// 1.switch
		switch (num) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
		default:
			System.out.println("I don't know.");
		}
// 2.if
		if (num2 == 1) {
			System.out.println("dog");
		} else if (num2 == 2) {
			System.out.println("cat");
		} else if (num2 == 3) {
			System.out.println("chick");
		} else {
			System.out.println("I don't know.");
		}

	}
}
