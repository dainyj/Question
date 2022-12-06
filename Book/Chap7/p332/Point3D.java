package p332;

public class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		//또는 부모클래스에 Point(){} 메서드를 생성해주면 오류가 나지 않는다.
		super(x, y); //부모클래스의 (멤버변수가 x, y가 있는)메서드를 호출.
//		this.x = x; //위의 super로 부모클래스 호출했으므로 x,y 값이 호출되어서 이 x,y를 필요없다. 
//		this.y = y; 
		this.z = z;
	}

	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}

}
