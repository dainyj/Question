package string_;

public class Ex595 {
	public static void main(String[] args) {
		String str = "Hong Gil Dong";
//		System.out.println(str.substring(3, 7));

//		char c1 = str.charAt(3);
//		char c2 = str.charAt(4);
//		char c3 = str.charAt(5);
//		char c4 = str.charAt(6);

//		System.out.print(c1);
//		System.out.print(c2);
//		System.out.print(c3);
//		System.out.print(c4);
//		System.out.println();

		for (int i = 3; i <= 6; i++) {
			System.out.print(str.charAt(i));
		}

	}

}