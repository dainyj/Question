package for_ex21;

public class FlowEx21 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.printf("[%d,%d]", i, j); //[%d,%d]의 칸 수가 5칸 -> "%5c 수 맞춤.
				} else {
					System.out.printf("%5c", ' ');
				}
			}
			System.out.println();
		}
	}
}
