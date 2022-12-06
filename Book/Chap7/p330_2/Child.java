package p330_2;

public class Child extends Parent {
	int x = 20;

	void method() {
		System.out.println("x=" + x); // 가까운데 있는 값이 나온다.
		System.out.println("this.x=" + this.x); // 자식클래스의 x
		System.out.println("super.x" + super.x); // 부모클래스의 x
	}
}
