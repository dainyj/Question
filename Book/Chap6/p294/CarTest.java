package p294;

class Car {
	String color;  //멤버변수는 private으로 숨겨두고 27번 라인처럼 인스턴스 생성과 동시에 값을 넣어주는 것이 깔끔하다.
	String gearType;
	int door;

	Car() {
	}

	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;

		Car c2 = new Car("white", "auto", 4);
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}
}
