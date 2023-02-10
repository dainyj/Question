package q182;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp1 = sc.next().charAt(0);
		char inp2 = sc.next().charAt(0);
//		System.out.println(inp1 + " " + inp2);
//		System.out.println((int) inp1 + " " + (int) inp2);
		sc.close();

		int sum = inp1 + inp2;
		int minus = inp1 - inp2;

		System.out.print(Math.abs(sum) + " " + Math.abs(minus));
	}

}
