/*문제1. 한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.
* 입출력 예의 진한 글씨는 출력값입니다.*/
package test2_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("number? ");
			int num = sc.nextInt();
//			System.out.println(num);
			if (num > 0) {
				System.out.println("positive integer");
			} else if (num < 0) {
				System.out.println("negative number");
			} else if (num == 0) {
				sc.close();
				break;
			}
		}

	} // main end
}



/*  boolean b = true;
 * do{
 * 		System.out.print("number? ");
 * 		int inp = sc.nextInt();
 *  	if(inp>0){
 * 	  		System.out.println("pos");
 * 		}else if(inp<0){
 * 			System.out.println("neg");
 * 		}else {
 * 			b=false;
 * 		}
 * }while(b);
 * 
 * 
 */

