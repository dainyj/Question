package q9012_3_StackX;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>();
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			String inp = sc.next();
//			System.out.println(inp);
			stk.clear();

			int cnt = 0;
			boolean b = true;
			for (int j = 0; j < inp.length(); j++) {
				if (inp.charAt(j) == '(') {
					cnt--;
				} else {
					cnt++;
				}
				if (cnt > 0) {
					b = false;
					break;
				}
			}
			if (cnt == 0 && b == true) {

			}

		}

	}

}
