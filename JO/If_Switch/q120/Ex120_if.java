package q120;

import java.util.Scanner;

public class Ex120_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();

		if (i1 > i2) {
			System.out.println(i1 - i2);
		} else {
			System.out.println(i2 - i1);
		}
	}

}
