package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");
			sum += num[i];
		}
		sc.close();
//		System.out.println(sum);
		int res = sum - 100;
//		System.out.println(res);
		
		int n1 = 0;
		int n2 = 0;
		for (int i = 0; i < num.length; i++) {
			for (int n = 0; n < num.length; n++) {
				int out = num[i] + num[n];
				if (out == res && num[i] != num[n]) {
					n1 = i;
					n2 = n;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (i != n1 && i != n2) {
				System.out.println(num[i]);
			}

		}
	}
}
