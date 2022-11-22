package q532;

import java.util.Scanner;

public class Ex532_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		sc.close();

//		System.out.println(n1);
//		System.out.println(n2);

// 방법1
//		if (n1 >= 4.0 && n2 >= 4.0) {
//			System.out.println("A");
//		} else if (n1 >= 3.0 && n2 >= 3.0) {
//			System.out.println("B");
//		} else {
//			System.out.println("C");
//		}

// 방법2	
		if (n1 >= 4.0) {
			if (n2 >= 4.0) {
				System.out.println("A");
			} else if (n2 >= 3.0) {
				System.out.println("B");
			} else if (n2 < 3.0) {
				System.out.println("C");
			}

		} else if (n1 >= 3.0) {
			if (n2 >= 3.0) {
				System.out.println("B");
			} else if (n2 < 3.0) {
				System.out.println("C");
			}
		} else {
			System.out.println("C");
		}
	}

}
