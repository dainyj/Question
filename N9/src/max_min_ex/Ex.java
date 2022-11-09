package max_min_ex;
// 정수 6개 입력 최대값, 최소값 출력

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		int max = 0;
		int min = 0;
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			System.out.print(num[i] + " ");
		}
		sc.close();

		max = num[0];
		min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
		}
//		삼항연산자 이용법
//		max = max > inp ? max : inp;
//        min = min < inp ? min : inp;
		
		
		

		System.out.println();
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}
