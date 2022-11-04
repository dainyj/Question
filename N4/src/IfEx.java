public class IfEx {
	public static void main(String[] args) {
		int num = 8;

		if (num > 9) {
			System.out.println("A");
			// if문 첫번째 조건에서 true가 나오면 뒤의 조건은 건너뛴다.
		} else if (num > 7) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		System.out.println("B");
	}

}
