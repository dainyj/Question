package ifEx;

import java.util.Scanner;

public class Ex535_switch_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		sc.close();
		
//switch
		switch ((int)score) {
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		default:
			System.out.println("retake");
		}
		
//if
		if (score >= 4.0) {
			System.out.println("scholarship");
		} else if (score >= 3.0) {
			System.out.println("next semester");
		} else if (score >= 2.0) {
			System.out.println("seasonal semester");
		} else {
			System.out.println("retake");
		}

	}

}
