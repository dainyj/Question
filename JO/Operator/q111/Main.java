/*국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 
 * 총점과 평균을 구하는 프로그램을 작성하시오. 
 * (단 평균의 소수점 이하는 버림 한다.)
 * 입력 70 95 63 100
 * 출력  sum 328
		avg 82
*/
package q111;

import java.util.Scanner;
//1.클래스를 따로 만들어서
// 클래스 Scan 안에서 get set 사용해보기
class Scan { // 점수 입력, 합계 & 평균 계산
	private int[] sco = new int[4];
	private int i;

	public Scan() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sco.length; i++) {
			sco[i] = sc.nextInt();
		}
		sc.close();
	}

	public int getSco() {
		return sco[i]; //
	}

	public void print() {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < sco.length; i++) {
//			System.out.print(sco[i] + " ");
			count = i + 1;
			sum += sco[i];
		}
//		System.out.println();
		System.out.println("sum " + sum);
		System.out.println("avg " + sum / count);
	}
} // c_Scan end

public class Main {
	public static void main(String[] args) {
		Scan sc = new Scan();
		sc.print();

	}
}
//2.같은 클래스 내에 메서드 만들어서
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

//3.같은 클래스 같은 메서드 안에서
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
