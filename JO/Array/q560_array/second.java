package q560_array;

import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
//			System.out.print(num[i] + " ");
		}
		sc.close();

		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < num.length; i++) {
			//방법1
//			if (num[i] < min) {
//				min = num[i];
			
//			방법2
			min = num[i] <min?num[i]:min;
			}
//		방법3 버블소트 사용가능	
		
			System.out.print(min);
		}

	}


