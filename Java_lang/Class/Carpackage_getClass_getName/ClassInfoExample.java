package Carpackage_getClass_getName;

public class ClassInfoExample {
	public static void main(String[] args) {
		Car car = new Car(100);
		Class clazz = car.getClass();
		System.out.println(clazz.getName()); //패키지명.클래스명 
		System.out.println(clazz.getSimpleName()); 
		System.out.println(clazz.getPackage().getName());
	}

}
