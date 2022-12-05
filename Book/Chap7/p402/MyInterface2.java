package p402;

public interface MyInterface2 {
	default void method1() {
		System.out.println("method1() int MuInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() int MyInterface2");
	}
}
