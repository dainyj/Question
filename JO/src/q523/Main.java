package q523;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		System.out.println(inp1);
		System.out.println(inp2);

//2.
		System.out.print(inp1 + " > " + inp2 + " --- ");
		if (inp1 > inp2)
			System.out.println("true");
		else
			System.out.println("false");

		System.out.print(inp1);

//1.
//		System.out.printf("%d > %d --- %b\n", inp1, inp2, inp1 > inp2);
//		System.out.printf("%d < %d --- %b\n", inp1, inp2, inp1 < inp2);
//		System.out.printf("%d >= %d --- %b\n", inp1, inp2, inp1 >= inp2);
//		System.out.printf("%d <= %d --- %b\n", inp1, inp2, inp1 <= inp2);

	}

}
