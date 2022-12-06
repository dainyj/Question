package repeat;

import java.util.Scanner;

public class Ex538 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		for (;;) {
//			System.out.print("number? ");
//			int inp = sc.nextInt();
//
//			if (inp > 0) {
//				System.out.println("positive integer");
//			} else if (inp < 0) {
//				System.out.println("negative number");
//			} else {
//				sc.close();
//				break;

//		while (true) {
//			System.out.print("number? ");
//			int n = sc.nextInt();
//			if (n > 0) {
//			     System.out.println("positive integer");
//			} else if (n < 0) {
//			     System.out.println("negative number");
//			} else
//			break;
//			}
//			sc.close();
//			}
		
	   int inp;
	      do {
	         System.out.print("number? ");
	         inp=sc.nextInt();
	         if(inp>0) {
	            System.out.println("positive integer");
	         } else if(inp<0) {
	            System.out.println("negative number");
	         }
	         
	      } while(inp!=0);
	      sc.close();
	      

	      }  
	}
