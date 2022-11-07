
public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "JBEdu";
		String strVar2 = "JBEdu";

		if (strVar1 == strVar2) {  //레퍼런스 변수 주소값을 비교
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}

		if (strVar1.equals(strVar2)) {  //힙 영역에 저장된 문자열을 직접 비교
			System.out.println("두 문자열이 같음");
		}

		String strVar3 = new String("JBEdu");
		String strVar4 = new String("JBEdu");

		if (strVar3 == strVar4) {   // stack의 주소값을 비교
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}

		if (strVar3.equals(strVar4)) {  //heap영역에 저장된 값 비교
			System.out.println("두 문자열이 같음");
		}

	}

}
