package q572_function1;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	double c = 3.14;

	public void r() {
		double ca = c * num * num;
		System.out.printf("%.2f", ca);
		sc.close();
	}

	public static void main(String[] args) {
		Main m = new Main();
		{
			m.r();
		}
	}

}

//		>넓이를 출력하는 함수
//		>(입력받을 r ^2)*3.14