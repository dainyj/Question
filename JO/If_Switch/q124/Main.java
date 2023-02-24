/*1~12사이의 정수를 입력받아 평년의 경우 입력받은 월을 입력받아 평년의 경우 해당 월의 날수를 출력하는 프로그램을 작성하시오.
입력 2 출력 28*/
package q124;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

//	tanswer // 자바 버전이 올라감에 따라 이런 기능도 제공하는듯하나 아직 정올에선 통과가 되지 않는다.
//		switch (num) {
//		case 1, 3, 5, 7, 8, 10, 12:
//			System.out.println("31");
//			break;
//		case 2:
//			System.out.println("28");
//			break;
//		case 4, 6, 9, 11:
//			System.out.println("30");
//			break;
//		}

//	방법1	

//		if (num == 2) {
//			System.out.println("28");
//		} else if (num <= 7 && num % 2 != 0) {
//			System.out.println("31");
//		} else if (num < 7 && num % 2 == 0) {
//			System.out.println("30");
//		} else if (num <= 12 && num % 2 == 0) {
//			System.out.println("31");
//		} else if (num < 12 && num % 2 != 0) {
//			System.out.println("30");
//		}

//	방법2

//		if (num == 2) {
//			System.out.println("28");
//		} else if (num <= 7 && num != 2) {
//			switch (num % 2) {
//			case 0:
//				System.out.println("30");
//				break;
//			default:
//				System.out.println("31");
//			}
//		} else if (num > 7 && num <= 12) {
//			switch (num % 2) {
//			case 0:
//				System.out.println("31");
//				break;
//			default:
//				System.out.println("30");
//			}
//		}

//	방법3

//		switch (num) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("31");
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			System.out.println("30");
//			break;
//		case 2:
//			System.out.println("28");
//			break;
//		}

	}

}
