package test5_2;

import java.util.Scanner;

public class Main {
	
	public void C(int r) {
		double w = r*r*3.14;
		System.out.printf("%.2f",w);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		m.C(r);
	}
}
