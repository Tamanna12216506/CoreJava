package queue;
import java.util.*;
public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque();
		ad.offer(10);
		ad.offer(15);
		ad.offer(16);
		ad.offer(17);
		System.out.println(ad);
		ad.poll();
		System.out.println(ad);
		ad.pollFirst();
		System.out.println(ad);
		ad.pollLast();
		System.out.println(ad);
	}

}
