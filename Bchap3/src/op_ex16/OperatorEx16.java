package op_ex16;

public class OperatorEx16 {
	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f; //소수점자리 셋째자리 표시 방법
		System.out.println(shortPi);
		System.out.println(Math.PI);
	}

}
