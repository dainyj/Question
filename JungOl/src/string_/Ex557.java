package string_;

import java.util.Scanner;

public class Ex557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = new char[10];

		for (int i = 0; i < c.length; i++) {
			String s= sc.next();
			c[i]= s.charAt(0);
//			c[i] = sc.next().charAt(0);

		}
//if(i==0||i==3||i==6) {		
		System.out.printf("%c %c %c",c[0],c[3],c[6]);
//}
		sc.close();

	}

}