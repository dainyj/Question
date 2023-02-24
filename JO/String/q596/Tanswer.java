package q596;

import java.util.Scanner;

public class Tanswer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str + " ");
		int num = sc.nextInt();
		System.out.println(num);
		sc.close();

		for (int i = str.length() - 1; 0 <= i && 0 < num; num--, i--) {
			System.out.print(str.charAt(i));

		}

	} // Main end

}

