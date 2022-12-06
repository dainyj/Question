package Reflection;

import java.lang.reflect.*;

import javax.security.auth.login.Configuration.Parameters;

public class Main {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Reflection.TClass"); //패키지명.클래스명

			System.out.println("[Class Name]");
			System.out.println(clazz.getName());
			System.out.println();

			System.out.println("[Constructor Info]");
			Constructor[] constructors = clazz.getDeclaredConstructors();//생성자 관련 정보를 뽑아온다.
			for (Constructor constructor : constructors) {  //향상된 for문
				System.out.print(constructor.getName() + "(");
				Class[] parameters = constructor.getParameterTypes(); //결과값 출력
				printParameters(parameters);
				System.out.println(")");
			}
			System.out.println();
			System.out.println("[Field Info]");
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			System.out.println();

			System.out.println("[Method Info]");
			Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
				System.out.print(method.getName() + "(");
				Class[] parameters = method.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			System.out.println();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < parameters.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
