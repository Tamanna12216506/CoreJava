package arrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AcessingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al.get(0));
		
		////using for loop
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("/////////////////");
		
		////iterator
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("/////////////////");
		///for each
		for(Object o:al) {
			System.out.println(o);
		}
		System.out.println("/////////////////");

		/////List iterator
		ListIterator l = al.listIterator(2); // when we want to work till particular index
//		while(l.hasNext()) {
//			System.out.println(l.next());
//		}
//		System.out.println("/////////////////");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		
		
	}

}
