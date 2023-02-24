package q173;

import java.util.Scanner;

public class Tanswer {
	public int method(int x, int y) {
		if (x > y) {
			return x * x - y * y;
		} else {
			return y * y - x * x;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(a + " " + b);

		Tanswer t = new Tanswer();
		int z = t.method(a, b);
		System.out.println(z);

	}

}
