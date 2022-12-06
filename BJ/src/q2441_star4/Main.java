/*
*****
 ****
  ***
   **
    *
*/
package q2441_star4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
//		System.out.println(n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = n - i; j > 0; j--) {  //for(int j=0; j<n-1; j++) Tanswer
				System.out.print("*");
			}
			System.out.println();
		}
	}//
}
