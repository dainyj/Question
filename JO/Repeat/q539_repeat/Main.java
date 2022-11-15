package q539_repeat;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		배열 사용
		int[] ar = new int[100];
		int i = 0;
		for (;; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] >= 100) {
				sc.close();
				break;
			}

		}
		int sum = 0;
		for (int j = 0; j <= i; j++) {
//			System.out.print(ar[j] + " ");
			sum += ar[j];
		}
		if (ar[i] >= 100) {
			System.out.println(sum);
			System.out.printf("%.1f\n", (double) sum / (i + 1));
		}

	}
}

//----------------------------------------
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//
//		for (int i = 1; i > 0; i++) {
//			int inp = sc.nextInt();
//			int res1 = inp + sum;
//			sum = res1;
//			if (inp < 100) {
////				System.out.print(i + "\s");
////				System.out.print(inp + "\s");
////				System.out.print(sum + "\s");
////				System.out.println(res1);
////				System.out.printf("%.1f\n", (double) res1 / i);
//			} else if (inp >= 100) {
//				System.out.println(res1);
//				System.out.printf("%.1f\n", (double) res1 / i);
//
//				sc.close();
//				break;
//			}
//		}
//	}
//}


