/*직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5 증가시키고
 *  세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
출력 width = 25     입력 20 15
    length = 30
    area = 750
*/
package q113;

import java.util.Scanner;
// 메서드 만들어서
public class Main {
	private int w;
	private int l;

	public Main() {
	}

	public Main(int w, int l) {
		this.w = w;
		this.l = l;
	}

	public void scan() {
		Scanner sc = new Scanner(System.in);
		w = sc.nextInt();
		l = sc.nextInt();
		sc.close();
//		System.out.println(w + " " + l);
	}

	public void print() {
		int width = this.w + 5;
		int length = this.l * 2;
		int area = width * length;
		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.scan(); // 입력 실행 및 확인
		m.print();
	}
}
// 기본형
//----------------------------------------------------
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int w = sc.nextInt();
//		int l = sc.nextInt();
//		sc.close();
//
//		int width = w + 5;
//		int length = l * 2;
//		int area = width * length;
//		System.out.println("width = " + width);
//		System.out.println("length = " + length);
//		System.out.println("area = " + area);
//	}
//}
