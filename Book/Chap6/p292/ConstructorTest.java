package p292;

class Data1{
	int value;
}

class Data2{
	int value;
	
	Data2(int x){ //매개변수가 있는 생성자
		value = x;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); //컴파일 에러(complie error) 발생
//		컴파일러는 생성자가 '하나도 없을 때'만 자동으로 '기본 생성자를 추가'해준다. 
	}

}
