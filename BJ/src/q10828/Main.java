/*
package q10828;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.Stack;

//class Mstk { // stk하면 LILO
//	private int[] ar;
//	private int mTop; // 저장한 값을 가리킬 포인터가 필요, 현재 포인터 위치
//
//	public Mstk() {
//		ar = new int[10000];
//		mTop = -1;
//	}
//
//	public void push(int p) {
//		ar[++mTop] = p;
//	}
//
//	public void top() {
//		if (mTop == -1) {
//			System.out.println(mTop);
//		} else {
//			System.out.println(ar[mTop]);
//		}
//	}
//
//	public void size() {
//		System.out.println(mTop + 1);
//
//	}
//
//	public void empty() {
//		if (mTop == -1) {
//			System.out.println("1");
//		} else {
//			System.out.println("0");
//		}
//	}
//
//	public void pop() {
//		if (mTop == -1) {
//			System.out.println(mTop);
//		} else {
//			System.out.println(ar[mTop--]);
//		}
//	}
//
//}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Mstk stk = new Mstk();
		Reader stk = new Stack<>();
		BufferedReader bf = new BufferedReader(stk);
		int x = sc.nextInt();
		System.out.println(x);
		for (int i = 0; i < x; i++) {
			String method = sc.next();
			switch (method) {
			case "push":
				int p = sc.nextInt();
				stk.push(p);
				break;
			case "top":
				stk.top();
				break;
			case "size":
				stk.size();
				break;
			case "empty":
				stk.empty();
				break;
			case "pop":
				stk.pop();
				break;

			}
//			문자 입력받은거 비교 해서 메서드 실행되도록??

		}
		sc.close();
	}
}
*/
