package queue;

import java.util.LinkedList;

public class LinkListDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList q = new LinkedList<Integer>();

	        q.offer(10);
	        q.offer(15);
	        q.offer(16);
	        q.offer(17);

	        System.out.println(q);
	        q.remove(Integer.valueOf(100));
	        q.poll();    // removes first element
	        System.out.println(q);
	}

}
