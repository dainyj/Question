package q561_array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int max = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");

			if (num[i] < 100) {
//				System.out.print(num[i] + " ");
				if (num[i] > max) {
					max = num[i];
				}
			}
//				else if(!(num[i]<100))                   <   이 부분이 문제 해당하는 숫자 없을때 100출력은 어떻게?
//				System.out.println(100);                   생각 좀 해보자

		}
		System.out.println(100);

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();

			if (num[i] >= 100) {
//				System.out.print(num[i] + " ");
				if (num[i] < min) {
					min = num[i];
				}
			}
//					else if(!(num[i]>=100))                  <   위와 같음.
//				System.out.println(100);

		}
		System.out.println();
		System.out.print(max + " ");
		System.out.print(min);
	}

}
