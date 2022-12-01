/*삼각형의 세 꼭지점의 정수 좌표를 입력받아 삼각형의 무게중심의 실수 좌표를 구하여 
소수 첫째자리까지 출력하는 프로그램을 작성하시오.
*/
//	입력형식	x1 y1 x2 y2 x3 y3

package q616;

import java.util.Scanner;

class Triangle {
	private int[] t = new int[6];
	double xsum=0;
	double ysum=0;
	int sum=0;

	void scan() { // 꼭지점 좌표 입력
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			t[i] = sc.nextInt();
//			System.out.print(t[i] + " ");
		}
		sc.close();
		}

	void calc() { // 무게중심 계산
//		삼각형의 무게중심 = ((x1+x2+x3)/3 (y1+y2+y3)/3)
//		                  0  2  4      1  3  5  
		for (int i = 0; i < t.length; i+=2) {
				xsum += t[i];
		}
//		System.out.println(xsum);

		for (int i = 1; i < t.length; i +=2) {
			ysum += t[i];
		}
//		System.out.println(ysum);
		System.out.printf("(%.1f, %.1f)",xsum/3,ysum/3);
	}
} // c_T end

public class Main {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.scan();
		tri.calc();
	}
}
