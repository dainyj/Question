package q1149;

import java.util.*;

class Color {
	int R;
	int G;
	int B;
}

public class Main {
	static Color mat[], v[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		mat = new Color[N];
		for (int i = 0; i < N; i++) {
			mat[i] = new Color();
		}
		v = new Color[N];
		for (int i = 0; i < N; i++) {
			v[i] = new Color();
		}

		for (int i = 0; i < N; i++) {
			mat[i].R = sc.nextInt();
			mat[i].G = sc.nextInt();
			mat[i].B = sc.nextInt();
		}
		sc.close();

		v[0].R = mat[0].R;
		v[0].G = mat[0].G;
		v[0].B = mat[0].B;
		System.out.print(v[0].R + " ");
		System.out.print(v[0].G + " ");
		System.out.println(v[0].B);
		for (int i = 1; i < N; i++) {
			v[i].R = mat[i].R + (v[i - 1].G > v[i - 1].B ? v[i - 1].B : v[i - 1].G);
			v[i].G = mat[i].G + (v[i - 1].R > v[i - 1].B ? v[i - 1].B : v[i - 1].R);
			v[i].B = mat[i].B + (v[i - 1].G > v[i - 1].R ? v[i - 1].R : v[i - 1].G);
			System.out.print(v[i].R + " ");
			System.out.print(v[i].G + " ");
			System.out.println(v[i].B);
		}
		int min = (v[N - 1].R > v[N - 1].G ? v[N - 1].G : v[N - 1].R);
		min = min > v[N - 1].B ? v[N - 1].B : min;

		System.out.println(min);
	}
}
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int house = sc.nextInt(); // 집 수
//		System.out.println(house);
////		 색칠비용 RGB
//		int[][] color = new int[house][3];
//		for (int i = 0; i < house; i++) {
//			for (int j = 0; j < 3; j++) {
//				color[i][j] = sc.nextInt();
//				System.out.print(color[i][j] + " ");
//			}
//			System.out.println();
//		}
//		sc.close();
//
//		System.out.println("------------------");
//		// 계산
//		//3항 연산자 비교 사용해보기
//		System.out.println("최소값색 R=0, G=1, B=2");
//		int[] min = new int[house];
//		min[0] = Math.min(color[0][0], color[0][1]);
//		System.out.println("min0 " + min[0]);
//		int c = 0;
//		for (int i = 0; i < 3; i++) {
//			if (min[0] == color[0][i]) {
//				System.out.println("최소값색 " + i);
//				c = i;
//			} // 최소값의 색을 확인
//
//		}
//		for (int i = 0; i < 3; i++) {
//			if (c != i) { // 다른 색으로 선택
//				min[1] = Math.min(color[1][i], color[1][i]);
//				
//				System.out.println("min1 " + min[1]);
//				if (min[1] == color[1][i]) {
//					c = i;
//				}
//
//			}
//		}
//	}
//}
