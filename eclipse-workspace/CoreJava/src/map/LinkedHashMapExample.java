package map;
import java.util.*;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm = new LinkedHashMap();
		
		hm.put(1, "ABC");
		hm.put(8, "b");
		hm.put(11, "c");
		hm.put(10, "d");
		hm.putIfAbsent(10, "e");
		
		System.out.println(hm);
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		for(Object o : hm.entrySet()) {
			System.out.println(o);
		}
		
		System.out.println("After using iterator");
		Iterator i = hm.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
