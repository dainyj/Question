package q9012;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {

			try {
				String str = sc.next();
//				str = args[0];

				for (int j = 0; j < str.length(); j++) {
					char ch = str.charAt(i);

					if (ch == '(') {
						st.push(ch + "");
					} else if (ch == ')') {
						st.pop();
					}
				}
				if (st.isEmpty()) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}

			} catch (EmptyStackException e) {
				System.out.println("NO");
			} // try

		}
		sc.close();

		if (args.length != 1) {
			System.exit(0);
		}

	}

}
