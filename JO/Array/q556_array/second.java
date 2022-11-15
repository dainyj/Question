package q556_array;

import java.util.Arrays;

public class second {

	public static void main(String[] args) {
//		1st
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

//		2nd
		int[] num2 = new int[10];
		for (int i = 0; i < num.length; i++) {
			num2[i]=i+1;
			System.out.print(num2[i] + " ");
		}
//직접 입력하는 방법
//		num2[0] = 1;
//		num2[1] = 2;
//		num2[2] = 3;
//		num2[3] = 4;
//		num2[4] = 5;
//		num2[5] = 6;
//		num2[6] = 7;
//		num2[7] = 8;
//		num2[8] = 9;
//		num2[9] = 10;
		System.out.println();

//		3rd       정올 정답은 아님.(형식이 안맞아서)
		int[] num3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(num3));	//배열 메서드 사용

	}

}
