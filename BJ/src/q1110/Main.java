/*먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
 * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 
 * 새로운 수를 만들 수 있다. 
26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 
8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
*/
//		26부터 시작한다.               2+6 = 8이다. 새로운 수는 68이다
//	26	x = n/10 :2  y = n%10 :6     x+y= 8    -> n= y*10+ (x+y)%10 : 6*10 + (2+6)=68
//	68 	x = 6 		y=8				 x+y = 14	n = 80+	(x+y)%10	
package q1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 정수 입력
		sc.close();

		int x = 0;
		int y = 0;
		int n = num;
		int count = 0;
		do {
			x = n / 10;
			y = n % 10;
			n = y * 10 + (x + y) % 10;
			count++;
		} while (n != num);
		System.out.println(count);
	}
}
