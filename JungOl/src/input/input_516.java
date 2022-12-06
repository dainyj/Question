package input;

import java.util.Scanner;

public class input_516 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextFloat();
		double d2 = sc.nextFloat();
		String s1 = sc.next();

		sc.close();

		System.out.printf("%.2f\n", d1);
		System.out.printf("%.2f\n", d2);
		System.out.println(s1);

	}

}
