package constructor;

public class Main {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 111, 32, 74, 97, 118, 97 };
//						  H    e    l    o       J   a   v    a
//						 0    1		2	3	4	5	6	7	8		
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 5, 4); //5번째부터 4개
		System.out.println(str2);

		System.out.printf("%c", 65);
		System.out.println();
		System.out.printf("%c", 97);

	}

}
