package map_HashSet;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "홍길동"), 95); // 키값이 같으면 하나만 저장, 다르면 둘다 저장
		map.put(new Student(2, "홍길동"), 95);

		System.out.println("총 Entry 수 : " + map.size());
	}
}

