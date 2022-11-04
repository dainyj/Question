package repeat;

import java.util.Scanner;

public class Ex633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// 1번
//		for (;;) {
//		System.out.println("1. Korea");
//		System.out.println("2. USA");
//		System.out.println("3. Japan");
//		System.out.println("4. China");
//		System.out.print("number? ");
//		int inp = sc.nextInt();
	//
//		if (inp == 1) {
//			System.out.println("Seoul" + "\n");
//		} else if (inp == 2) {
//			System.out.println("Washington" + "\n");
//		} else if (inp == 3) {
//			System.out.println("Tokyo" + "\n");
//		} else if (inp == 4) {
//			System.out.println("Beijing" + "\n");
//		} else {
//			System.out.println("none");
//			sc.close();
//			break;
	//		}
//		여기에 줄바꿈 넣기
	//}		

//	2번	
//		int inp;
//		do {
//			System.out.println("1. Korea");
//			System.out.println("2. USA");
//			System.out.println("3. Japan");
//			System.out.println("4. China");
//			System.out.print("number? ");
//			inp = sc.nextInt();
//			
//			if (inp == 1) {
//				System.out.println("Seoul" + "\n");
//			} else if (inp == 2) {
//				System.out.println("Washington" + "\n");
//			} else if (inp == 3) {
//				System.out.println("Tokyo" + "\n");
//			} else if (inp == 4) {
//				System.out.println("Beijing" + "\n");
//			} else {
//				System.out.println("none");
//			}
//		} while(1<=inp && inp<=4);
//		sc.close();	
		
		
// 3번		
		  int inp;
	      do {
	         System.out.println("1. Korea");
	         System.out.println("2. USA");
	         System.out.println("3. Japan");
	         System.out.println("4. China");

	         System.out.print("number? ");
	         inp = sc.nextInt();

	         switch (inp) {
	         case 1:
	            System.out.printf("\n%s\n\n", "Seoul");
	            break;
	         case 2:
	            System.out.printf("\n%s\n\n", "Washington");
	            break;
	         case 3:
	            System.out.printf("\n%s\n\n", "Tokyo");
	            break;
	         case 4:
	            System.out.printf("\n%s\n\n", "Beijing");
	            break;
	         default:
	            System.out.printf("\n%s\n\n", "none");
	            sc.close();

	         }
	      } while (inp >= 1 && inp <= 4);

	}
	
}

// if를 사용해서 벗어나게 if (!( 1 <= inp && inp <= 4)) { 
//							System.out.println("none"); }

