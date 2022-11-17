package sum_avg_ex;
// 실수 5개 입력. 합계 평균 출력하기

//ex) 12.3 36.5 6.7 2.0 71.3

import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double[] num = new double[5];

			int count = 0;
			double sum = 0.0;

			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextDouble();
				sum += num[i];
				count++;
				System.out.printf(num[i] + " ");
			}
			sc.close();

			System.out.println();
			System.out.printf("sum = %.1f\n", (double) sum);
			System.out.printf("avg = %.1f\n", (double) sum / count);
		}
	}

}
