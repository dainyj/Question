package repeat;

import java.util.Scanner;

public class Ex540 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (; num > -1;) {
			num = sc.nextInt();

			if (num % 3 != 0) {
			} else if (num % 3 == 0) {
				System.out.println(num / 3);
			} else if (num == -1) {
				sc.close();
			}
		}
	}

}
