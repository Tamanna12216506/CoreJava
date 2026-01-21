package setPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet();
		set.add(16);
		set.add(32);
		set.add(null);
		set.add(18);
		HashSet<Integer> set1 = new HashSet();
		set1.add(10);
		set1.add(20);
		set1.add(16);
		set1.add(18);

		System.out.println(set);
		System.out.println(set1);

		System.out.println(set.contains(16));
		
		///using for each
		for(Object o:set) {
			System.out.println(o);
		}
		set.remove(16);
		System.out.println("Using remove all" +set.removeAll(set1));
		System.out.println(set);
		System.out.println(set1);
		System.out.println("Using retain all" +set1.retainAll(set1));
		System.out.println(set);
		System.out.println(set1);

		
		////Using iterator
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
