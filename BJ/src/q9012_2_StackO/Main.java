package q9012_2_StackO;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		int T = sc.nextInt();

//		1. Stack을 이용하는 방법
//		
		for (int i = 0; i < T; i++) {
			String inp = sc.next();
//			System.out.println(inp);
			stk.clear();

			boolean b = true;
//		반복문 돌면서 (인지 )인지 판단
			for (int j = 0; j < inp.length(); j++) {
				if (inp.charAt(j) == '(') {
					stk.push('(');
				} else {
					if (stk.isEmpty()) {
						b = false;
					} else {
						stk.pop();
					}
				}
			}
			if (b == true && stk.isEmpty()) {
				System.out.println("YES");
			}
		}
		sc.close();
	}
}
