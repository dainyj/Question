package p361;

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive,Brrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}

}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car(); //-> Car car =new FireEngine(); //로 바꾸면 문제없이 실행된다.
		
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine) car; 
		// 형변환의 오류, 부모타입의 인스턴스를 자식타입의 참조변수로 타입캐스팅이 안된다.
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}
