package q602;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inp = new String[5];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextLine();
//			System.out.println(inp[i]);
		}
		sc.close();

		for (int i = inp.length - 1; i >= 0; i--) {
			System.out.println(inp[i]);
		}

//		case 2
		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			al.add(sc.next());
		}
		sc.close();

		ListIterator<String> listIterator = al.listIterator(al.size()); // al.size()는 마지막으로 이동
		while (listIterator.hasPrevious()) { // hasPrevious()는 이전에 자료?가 있다면 이동?
			System.out.println(listIterator.previous());
		}

//		case3
		Stack<String> stack = new Stack<String>(); //stack은 lifo
		for (int i = 0; i < 5; i++) {
			String inp2 = sc.next();
			stack.push(inp2);
		}
		sc.close();

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
