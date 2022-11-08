package operator;

import java.util.Scanner;

public class operator_523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		sc.close();

		boolean b1 = (i1 > i2);
		boolean b2 = (i1 < i2);
		boolean b3 = (i1 >= i2);
		boolean b4 = (i1 <= i2);

//		System.out.println(b1);
//		System.out.println(b2);

		System.out.println(i1 + " > " + i2 + " --- " + b1);
		System.out.println(i1 + " < " + i2 + " --- " + b2);
		System.out.println(i1 + " >= " + i2 + " --- " + b3);
		System.out.println(i1 + " <= " + i2 + " --- " + b4);

	}

}
