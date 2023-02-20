package q197;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[8];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
//			System.out.print(inp[i] + " ");
		}
		sc.close();

		Rec r = new Rec(inp);
		r.cacl();
		r.print();
	}
}

class Rec {
//	x, y 각각 비교해서 작은 값을 앞에 큰 값을 뒤에
	private int[] n, x, y;

	public Rec(int[] inp) {
		this.n = inp;
	}

	public void cacl() {
		x = new int[4];
		y = new int[4];
		for (int i = 0; i < n.length; i++) {
			if (i % 2 == 0) {
				x[i / 2] = n[i];
			}
		}

		for (int i = 0; i < n.length; i++) {
			if (i % 2 != 0) {
				y[i / 2] = n[i];
			}
		}

		Arrays.sort(x);
		Arrays.sort(y);

	}

	public void print() {
		System.out.print(x[0] + " " + y[0] + " " + x[3] + " " + y[3]);
	}
}


//	case 2 - t
//class Rect {
//	   private int x1, y1, x2, y2;
//
//	   public Rect(int x1, int y1, int x2, int y2) {
//	      this.x1 = x1;
//	      this.y1 = y1;
//	      this.x2 = x2;
//	      this.y2 = y2;
//	   }
//
//	   public void print() {
//	      System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
//	   }
//
//	   public int getX1() {
//	      return x1;
//	   }
//
//	   public int getX2() {
//	      return x2;
//	   }
//
//	   public int getY1() {
//	      return y1;
//	   }
//
//	   public int getY2() {
//	      return y2;
//	   }
//	}
//
//	public class Main {
//	   public static void getWeight1(Rect[] inp) {
//	      int mx1 = Math.min(inp[0].getX1(), inp[1].getX1());
//	      int my1 = Math.min(inp[0].getY1(), inp[1].getY1());
//	      int mx2 = Math.max(inp[0].getX2(), inp[1].getX2());
//	      int my2 = Math.max(inp[0].getY2(), inp[1].getY2());
//	      
//	      System.out.print(mx1 + " ");
//	      System.out.print(my1 + " ");
//	      System.out.print(mx2 + " ");
//	      System.out.print(my2);
//	   }
//
//	   public static void main(String[] args) {
//	      Scanner sc = new Scanner(System.in);
//	      Rect[] inp = new Rect[2];
//	      for (int i = 0; i < inp.length; i++) {
//	         int x1 = sc.nextInt();
//	         int y1 = sc.nextInt();
//	         int x2 = sc.nextInt();
//	         int y2 = sc.nextInt();
//
//	         inp[i] = new Rect(x1, y1, x2, y2);
//	      }
//	      sc.close();
//
////	      for (int i = 0; i < inp.length; i++) {
////	         inp[i].print();
////	      }
//
//	      getWeight1(inp);
//	   }
//	}
//--------------------------------------------------------------------

//	case 3 - t--------------------------------------------------------
//public class Main {
//	   static Rect[] r;
//	   
//	   public static void main(String[] args) {
//	      Scanner sc = new Scanner(System.in);
//	      r = new Rect[2];
//	      for (int i = 0; i < r.length; i++) {
//	         int x1 = sc.nextInt();
//	         int y1 = sc.nextInt();
//	         int x2 = sc.nextInt();
//	         int y2 = sc.nextInt();
//	         r[i] = new Rect(x1, y1, x2, y2);
//	      }
//	      sc.close();
//
////	      for (int i = 0; i < r.length; i++) {
////	         r[i].print();
////	      }
//	      
//	      minxy();
//	   }
//	   
//	   public static void minxy() {
//	      Point[] p0 = r[0].getPoint();
//	      Point[] p1 = r[1].getPoint();
//	      System.out.print(Math.min(p0[0].getX(), p1[0].getX()) + " ");
//	      System.out.print(Math.min(p0[0].getY(), p1[0].getY()) + " ");
//	      System.out.print(Math.max(p0[1].getX(), p1[1].getX()) + " ");
//	      System.out.println(Math.max(p0[1].getY(), p1[1].getY()));
//	   }
//	}
//
//	class Rect {
//	   private Point[] p; // p[0] = 좌측하단, p[1] = 우측상단
//
//	   public Rect(int x1, int y1, int x2, int y2) {
//	      p = new Point[2];
//	      p[0] = new Point(x1, y1);
//	      p[1] = new Point(x2, y2);
//	   }
//
//	   public void print() {
//	      for (int i = 0; i < p.length; i++) {
//	         p[i].print();
//	      }
//	   }
//	   
//	   public Point[] getPoint() {
//	      return p;
//	   }
//	}
//
//	class Point {
//	   int x, y;
//
//	   public Point(int x, int y) {
//	      this.x = x;
//	      this.y = y;
//	   }
//
//	   public void print() {
//	      System.out.println(x + " " + y);
//	   }
//	   
//	   public int getX() {
//	      return x;
//	   }
//	   
//	   public int getY() {
//	      return y;
//	   }
//	}


