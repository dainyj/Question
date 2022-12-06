package input;

import java.util.Scanner;

public class input_110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double d1 = sc.nextDouble();
		sc.close();

		double d2 = d1 * 91.44;
		System.out.printf("%.1fyard = %.1fcm", d1, d2);

	}

}
