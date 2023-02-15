package q603;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
//		System.out.println(inp);
		sc.close();

		String[] arrInp = inp.split(" ");

		for (int i = 0; i < arrInp.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arrInp[i]);
			}
		}
	}
}
