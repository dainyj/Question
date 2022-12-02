package q111;

import java.util.Scanner;

// 클래스 Scan 안에서 get set 사용해보기
class Scan { // 점수 입력, 합계 & 평균 계산
	int[] sco = new int[4];
//	int i;

	public Scan() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sco.length; i++) {
			sco[i] = sc.nextInt();
		}
		sc.close();
	}

	public int getSco() {
		return sco[i];   //
	}

	public void print() {
		
		for (int i = 0; i < sco.length; i++) {
			System.out.print(sco[i] + " ");
		}
	}
} // c_Scan end

public class Main {
	public static void main(String[] args) {
		Scan sc = new Scan();
		sc.print();

	}
}
//=======================================================
//public class Main {
//	int[] score = new int[4];
//
//	public void scan() {
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < score.length; i++) {
//			score[i] = scan.nextInt();
//			System.out.print(score[i] + " ");
//		}
//		scan.close();
//		System.out.println();
//	}
//
//	public void calc() {
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//
//		int avg = sum / score.length;
//		System.out.println("sum " + sum);
//		System.out.println("avg " + avg);
//	}
//
//	public static void main(String[] args) {
//		Main m = new Main();
//		m.scan();
//		m.calc();
//	}
//}

//==========================================================
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] score = new int[4];
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			score[i] = sc.nextInt();
//			sum += score[i];
//		}
//		sc.close();
//		System.out.println("sum " + sum);
//		System.out.println("avg " + sum / score.length);
//	}
//}
