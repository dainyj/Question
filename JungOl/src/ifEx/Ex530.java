package ifEx;

import java.util.Scanner;

public class Ex530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		sc.close();

		if (i1 >= 20) {
			System.out.println("adult");
		} else if (i1 < 20) {
			System.out.println(20 - i1 + " years later");
		}

	}

}
