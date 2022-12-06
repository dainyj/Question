package p281;

public class MemberCall {
	int iv = 10;
	static int cv = 20;

	int iv2 = cv;
//	static int cv2 = iv; // 클래스 변수는 인스턴스 변수 사용불가.
	static int cv2 = new MemberCall().iv;

	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);  // static변수가 아닌 인스턴스 변수 iv는 인스턴스 생성해야 사용가능.
		MemberCall c = new MemberCall();
		System.out.println(c.iv);

	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);

	}

	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); //클래스 메서드 안에서는 인스턴스 메서드를 호출할 수 없다.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); //인스턴스 생성 후에야 호출 가능
	}

	void intstanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}

}
