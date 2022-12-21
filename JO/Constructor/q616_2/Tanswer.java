package q616_2;

import java.util.Scanner;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(x + " " + y);
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

class Triangle { 
	private Point[] p;  

	public Triangle(int[] param) { // 스캐너로 입력한 배열p를 넣어줄 배열.
		p = new Point[3]; //class Point의 배열3을 만듬. 
		for (int i = 0, j = 0; i < p.length; i++, j += 2) {
			p[i] = new Point(param[j], param[j + 1]);
		}
	}

	public void print() {
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
	}

	public void getCoG() {
		int x = 0, y = 0;
		for (int i = 0; i < p.length; i++) {
			x += p[i].getX();
			System.out.println(x+" ");
			y += p[i].getY();
			System.out.println(y+" ");
		}
		System.out.printf("(%.1f, %.1f)\n", (double) x / 3, (double) y / 3);
	}
}

public class Tanswer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] p = new int[6];
		for (int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();

//		입력된 배열 확인
//		for (int i = 0; i < p.length; i++) {
//			System.out.print(p[i] + " ");
//		}

		Triangle tri = new Triangle(p);  // class Triangle에 배열 p[]를 넘겨줌.
		tri.print();
		tri.getCoG();
	}
}