/*세 개의 정수를 전달받아 최대값을 구하여 리턴하는 함수를 작성하고,
세 정수를 입력받아 최대값을 출력하는 프로그램을 작성하시오.
입력 -10 115 33
출력 115
*/
package q574;

import java.util.Scanner;

public class Main {
	int maxi(int[] inp) { // inp=n;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < inp.length; i++) {
			max = max > inp[i] ? max : inp[i];
		}
		return max;
		
//		반복문 사용안했을때
//		int res1 = inp[0] > inp[1] ? inp[0] : inp[1];
//		int res2 = res1 > inp[2] ? res1 : inp[2];

//		System.out.println(res2);
//		return res2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
//			System.out.print(n[i]+" ");
		}
		sc.close();
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();

		Main m = new Main();
		int res = m.maxi(n); // 배열을 넘겨줄땐 배열 이름만
		System.out.println(res);
	}

}
