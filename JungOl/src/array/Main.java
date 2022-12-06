package array;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = new char[10];

		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);// 좌변과 우변의 타입이 일치해야하는데 c은 위에서 선언된 배열이므로 c[0]을 해줘야함.
	
			System.out.print(c[i]);
		}

		sc.close();
	}

}
