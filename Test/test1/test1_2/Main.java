package test1_2;
/*2. 하나의 정수를 입력받아, 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = num; i > 0 && i <= num; i--) {
			sum += i;
//			System.out.print(i + " ");
		}
		System.out.println(sum);

	} // main ens
}
