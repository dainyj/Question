package Ex5_14;

public class ArrayEx14 {

	public static void main(String[] args) {
		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("sec.charAt(" + i + "):" + ch);
		}
		char[] chArr = src.toCharArray();
//		String -> char배열

		System.out.println(chArr);

	}

}
