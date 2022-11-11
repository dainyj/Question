package q_baseballnumbergame;

import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		int[] n = new int[3];
		boolean eq;

		do {
			eq = false;
			for (int i = 0; i < n.length; i++) {
				n[i] = (int) (Math.random() * 10);
			}
			if (n[0] == n[1] || n[1] == n[2] || n[2] == n[0]) {
				eq = true;
			}

		} while (eq);

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		boolean b =false;
		
		do {
			System.out.print("Input Number..");
			for(int i=0;i<n.length;i++) {
				
			}
		
		}
	
	
	
	}
}
