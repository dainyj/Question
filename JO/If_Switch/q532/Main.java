/*두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
입력 4.3 3.5 출력 B
입력 4.0 2.9 출력 C*/
package q532;

import java.util.Scanner;

public class Main {
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
