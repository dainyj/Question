package q632;

import java.util.Scanner;

public class Ex632_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		sc.close();

		System.out.println(i1 + " " + i2 + " " + i3);

		if (i1 > i2) {
			if (i2 > i3) {
				System.out.println(i3);
			} else {
				System.out.println(i2);
			}
		} else {
			if (i1 > i3) {
				System.out.println(i3);
			} else {
				System.out.println(i1);
			}
		}

// 삼항연산자 사용
		int min = (i1 > i2) ? ((i2 > i3) ? i3 : i2) : ((i1 > i3) ? i3 : i1);
		System.out.println(min);
		
//		(i1 < i2 && i1 < i3) ? i1 : (i2 < i3) ? i2 : i3;
	}

}
