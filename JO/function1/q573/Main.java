package q573;

import java.util.Scanner;

public class Main {

	public void numr(int n) {
		for (int i = 0; i < n * n; i++) {
			if (i % n == 0) {
				System.out.println();
			}
			System.out.print(i + 1 + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
//		System.out.println(n);
		Main m = new Main();  //인스턴스화 레퍼런스 변수 m을 이용해서 Main클래스의 메서드 호출
		m.numr(n);                                                   //    <-
	}

}

//	n*n 사각형 출력