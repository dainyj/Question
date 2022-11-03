package ifEx;

import java.util.Scanner;

public class Ex533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		sc.close();

//		System.out.println(gender);
//		System.out.println(age);

		if (gender == 'M') {
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else {
			if (age >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}

		}

	}
}

//if (gender == 'M' && age>=18) {
//System.out.println("MAN");
//} else if (gender =='M' && age<18) {
//System.out.println("BOY");
//}