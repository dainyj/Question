package p407;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		int iiv = outerIv; //외부클래스의 private멤버도 접근가능하다.
		int iiv2 = outerCv;
	}

	static class StaticInner {
//		스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
//		int siv =outerIv; //인스턴스를 생성해야 사용가능하다. 그러나 스태틱은 인스턴스 생성없이 사용하는 클래스이므로 맞지않다.
		static int scv = outerCv;
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;

		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
//			외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv;//jdk1.8부터는 에러안남.
			int liv4 = LV;
		}
	}

}//
