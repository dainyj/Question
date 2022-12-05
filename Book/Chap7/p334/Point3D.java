package p334;

public class Point3D extends Point {
	int z = 30;

	Point3D() {
		this(100, 200, 300); //아래의 Point3D(int x, int y, int z)를 호출
	}//this는 이 클래스 안의 메서드를 표시

	Point3D(int x, int y, int z) { //부모클래스의 메서드 Point(int x, int y)를 호출
		super(x, y);
		this.z = z;
	}
}
