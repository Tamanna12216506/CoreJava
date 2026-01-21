package linkedListPrograms;
import java.util.*;

public class AddingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add(50);
		ll.add(80);
		ll.add(null);
		ll.add("Hello");
		
		System.out.println(ll);
		System.out.println(ll.contains(null));
		System.out.println(ll.indexOf(20));
		
		

	}

}
