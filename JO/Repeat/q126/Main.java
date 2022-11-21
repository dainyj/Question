package q126;

/*0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.*/
/* 9 7 10 5 33 65 0
odd : 5
even : 1*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int odd = 0;
		int even = 0;
		while (true) {
			int n = sc.nextInt();
//			System.out.print(n + " ");
			if (n == 0)
				break;
			if (n % 2 != 0 && n > 0) {
				odd++;
			} else if (n % 2 == 0 && n > 0) {
				even++;
			}
		}
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	} // main end
}
