package getenv;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("Path");
		System.out.println("Path : " + javaHome);

	}

}
