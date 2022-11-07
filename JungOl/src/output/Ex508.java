package output;

public class Ex508 {

	public static void main(String[] args) {

		String[] str = { "item", "count", "price", "pen", "20", "100", "eraser", "110", "97" };

		for (int i = 0; i <= 15; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.printf("\n");
			}
			System.out.printf("%10s", str[i]);
		}

//		System.out.println();
//		System.out.printf("%10s%10s%10s\n", str[0], str[1], str[2]);
//		System.out.printf("%10s%10s%10s\n", str[3], str[4], str[5]);
//		System.out.println();
//		System.out.printf("%10s%10s%10d\n", "item", "count", 110);
	}

}