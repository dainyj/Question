package p366;

public class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("x = " + x); // 지역변수가 우선 
		System.out.println("super.x = " + super.x);
		System.out.println("this.x = " + this.x);

	}
}
