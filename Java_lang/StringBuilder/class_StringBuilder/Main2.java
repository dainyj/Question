package class_StringBuilder;

public class Main2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("Java "); // append : 덧붙인다.
		sb.append("Program Study");
		System.out.println(sb.toString());
		System.out.println(sb); // 자동으로 toString 해준다.

		sb.insert(4, "2");
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		sb.replace(6, 13, "book");
		System.out.println(sb.toString());

		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("총문자수 : " + length);

		String result = sb.toString(); //타입을 변화시킴. 둘은 별개의 클래스이다.
		System.out.println(result);
	}
}
