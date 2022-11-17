package Ex5_1;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70;
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k + 2] + score[4];

		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d]:%d\n", i, score[i]);
		}
		System.out.printf("tmo:%d\n", tmp);
//		System.out.printf("score[%d]:%d\n", 7, score[7]);

		int[] score2 = { 50, 60, 70, 80, 90 }; // 배열 생성(선언)과 동시에 초기화

		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		System.out.println(score2);
		
	}

}
