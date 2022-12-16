package q10828;

import java.util.Scanner;
import java.util.Stack;

class Mstk {
	Stack<Integer> numBox = new Stack<Integer>();

	public void push() {
		numBox.push(null);

	}

	public int empty() {
		if (!numBox.isEmpty()) {
			return 0;
		} else {
			return 1;
		}
	}

	public void size() {
		numBox.size();
	}

	public int top() {
		if (!numBox.isEmpty()) {
			return 0;
		} else {
			return -1;
		}
	}

	public void pop() {

	}


}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mstk stk = new Mstk();
		int x = sc.nextInt();
		System.out.println(x);
		for (int i = 0; i < x; i++) {
			String method = sc.next();
//			문자 입력받은거 비교 해서 메서드 실행되도록??
			
		}
		sc.close();
	}

	public void save() {

	}

}
