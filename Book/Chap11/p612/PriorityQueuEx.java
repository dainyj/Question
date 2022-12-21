package p612;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuEx {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(3); // 오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq); //pq의 내부 배열을 출력

		Object obj = null;

//		PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
		while ((obj = pq.poll()) != null)
			System.out.println(obj);
	}

}
