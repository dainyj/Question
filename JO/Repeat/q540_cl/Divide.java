package q540_cl;

import java.util.Scanner;

public class Divide {
	public void Cal() {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int num = sc.nextInt();
			if (num == -1) { // 마지막에 넣었을 때 위 부분의 조건이 참이여서 통과되어버릴 수 있으므로 맨 위에 넣는게 안전하다.
				sc.close(); // break.직전에 넣어야 오류가 안생긴다.
				break;
			} else if (num % 3 == 0) {
				int res = num / 3;
				System.out.println(res);
			}
		}
	}
}
