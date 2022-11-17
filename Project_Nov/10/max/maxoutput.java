package max;

/* Q.사용자로부터 6개의 값을 입력받아서 가장 큰 값부터 차례대로 출력하는 프로그램을 작성하시오.
입력 예 : -27 6 -19 90 -72 39
출력 예 : 90 72 39 27 19 6*/
import java.util.Scanner;

public class maxoutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		int i = 0;

		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");
		}
		sc.close();

		for (i = 0; i < num.length; i++) {
			int max = Integer.MIN_VALUE;

			for (int j = 0; j < num.length; j++) {
				if (max < num[j]) {
					max = num[j];
				}
			}
			/* 최대값 -1 대입(가장 작은 수라 생각되는 수; 
			 * 임으로 -1지정함.) */
			for (int j = 0; j < num.length; j++) {
				if (max == num[j]) {
					num[j] = Integer.MIN_VALUE;
				}
			}

			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j] + " ");

			}
			System.out.print("max = " + max + "\n");
		}
	}

}

//		int max1 = 0;
//		int max2 = Integer.MIN_VALUE;
//		int max3 = Integer.MIN_VALUE;
//		int max4 = Integer.MIN_VALUE;
//
//		for (i = 0; i < num.length; i++) {
//			if (num[i] > max1) {
//				max1 = num[i];
//				System.out.print(max1 + " ");
//			}
//		}
//		for (i = 0; i < num.length; i++) {
//			if (max2 < num[i] && num[i] < max1) {
//				max2 = num[i];
//				System.out.print(max2 + " ");
//			}
//		}
//		for (i = 0; i < num.length; i++) {
//			if (max3 < num[i] && num[i] < max2) {
//				max3 = num[i];
//				System.out.print(max3 + " ");
//			}
//			}
//		for (i = 0; i < num.length; i++) {
//			if (max4 < num[i] && num[i] < max3) {
//				max4 = num[i];
//				System.out.print(max4 + " ");
//			}
//		}