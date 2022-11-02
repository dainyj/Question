package input;

import java.util.Scanner;

public class input_515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		sc.close();

		int res1 = num1 * num2;
		int res2 = num1 / num2;

		System.out.printf("%d * %d = %d\n", num1, num2, res1);
		System.out.printf("%d / %d = %d", num1, num2, res2);

	}

}
