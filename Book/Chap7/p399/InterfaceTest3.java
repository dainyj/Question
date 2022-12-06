package p399;

public class InterfaceTest3 {
	public static void main(String[] args) {
		A a= new A();
		a.methodA();
	}
}//

class A{
	void methodA() {
		I i =InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}
