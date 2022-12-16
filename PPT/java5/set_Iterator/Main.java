package set_Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servle/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체수 : " + size);

		Iterator<String> iterator = set.iterator(); //데이터 탐색용 메서드 
		while (iterator.hasNext()) { // 저장공간이 주어지고 맨앞을 가리킨다. 데이터 전체를 순회한다.
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수 : " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}

	}

}
