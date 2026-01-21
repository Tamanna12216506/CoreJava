package queue;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.offer(11);
		pq.offer(12);
		pq.offer(13);
		pq.offer(16);
		System.out.println(pq);
	}

}
