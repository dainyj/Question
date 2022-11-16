package q120;

import java.util.Scanner;

public class Main {
	public void num(int n1, int n2) {
		if (n1 > n2) {
			int res1 = n1 - n2;
			System.out.println(res1);
		} else if (n1 < n2) {
			int res2 = n2 - n1;
			System.out.println(res2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		System.out.println(Math.abs(n1 - n2));
//		Math.abs() 절대값 구하는 법

		Main m = new Main();
//		m.num(n1, n2);
	} // Main end

}
