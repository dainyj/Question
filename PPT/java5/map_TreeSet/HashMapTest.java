package map_TreeSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("홍길동", 85);
		map.put("동장군", 90);
		map.put("권 율", 79);
		map.put("홍길동", 91);

		System.out.println("총 entry 수 : " + map.size());

		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();

		Set<String> keySet = map.keySet();// 순회를 하기 위해선 키값이 있어야 함으로 map에서 key값을 가져와서 Set형태로 만듬.
		Iterator<String> keyIterator = keySet.iterator(); //Set으로 만든 키로 순회

		while (keyIterator.hasNext()) { //반복문으로 
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}

		System.out.println();

		map.remove("홍길동");
		System.out.println("총 entry 수 : " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		map.clear();
		System.out.println("총 entry 수 : " + map.size());

	}

}
