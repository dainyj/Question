package p409;

class Outer {
	int value = 10;

	class Inner {
		int value = 20;

		void method1() {
			int value = 30; //지역변수
			System.out.println("           value :" + value); //가장 가까운 변수를 찾는다. 
			System.out.println("      this.value :" + this.value); // 인스턴스 내(내부클래스 안)에 있는 변수
			System.out.println("Outer.this.value :" + Outer.this.value); //외부클래스 안에 있는 변수
		}
	} // Inner end
}// Outer end

public class InnerEx5 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method1();
	}
}
