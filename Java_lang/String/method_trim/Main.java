package method_trim;
//		trim은 양옆의 공백만 없애준다. 문자 사이의 공백은 유지.

public class Main {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123   ";
		String tel3 = "  45 67    ";

		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
	}

}
