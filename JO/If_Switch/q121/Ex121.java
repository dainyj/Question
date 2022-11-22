package q121;

import java.util.Scanner;

public class Ex121 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		if (num == 0) {
			System.out.println("zero");
		} else if (num > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
	}

}
