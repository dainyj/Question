package p402;

public class DefaultMethodTest {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface.staticMethod(); // static이 붙을 때 호출 방법 
		MyInterface2.staticMethod();
	}
}//
