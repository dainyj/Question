package p402;

public interface MyInterface {
	default void method1() {
		System.out.println("method1() int Parent");
	}
	default void method2() {
		System.out.println("method2() int Parent");
		
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() int Parent");
		
	}
	
}
