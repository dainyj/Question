package method_split;

public class Main {
	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-Simon";

		String[] names = text.split("&|,|-"); // '|'가 or로 사용됨. ($또는 ,또는 -를 기준으로 나눈다.)
		for (String name : names) {
			System.out.println(name);
		}
	}
}
