package repeat;

public class BreakExample {
	public static void main(String[] args) {
		int i = 1;

		while (true) { // (true)는 무한반복을 뜻한다.
			System.out.println(i);

			if (i == 6) { //코드블럭(중괄호) 생략가능, break 하나만 있어서
				break;
			}
			i = i + 1;
		}
	}

}
