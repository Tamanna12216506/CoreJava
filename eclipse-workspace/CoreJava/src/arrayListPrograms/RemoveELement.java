package arrayListPrograms;
import java.util.*;

public class RemoveELement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar = new ArrayList();
		ArrayList ar1 = new ArrayList();
		
		ar.add(10);
		ar.add(11);
		ar.add(12);
		ar.add(13);
		ar1.add(10);
		ar1.add(21);
		ar1.add(12);
		ar1.add(22);
		
		System.out.println(ar.remove(1));
		System.out.println("Collection ar after removing elment at single index: "+ar);
		
		System.out.println(ar.removeAll(ar1)); // it will delete common element
		System.out.println("Collection ar after using remove all: "+ar);
		System.out.println("Collection ar1 after using remove all: "+ar1);
		
		System.out.println(ar.retainAll(ar1));/// it will delete unique element
		System.out.println("Collection ar after using retain all: "+ar);
		System.out.println("Collection ar1 after using retain all: "+ar1);
		
		Collections.sort(ar1); /// for sorting the collection
		System.out.println("ArrayList after sorting: "+ar1);
		ar1.clear();
		System.out.println("After using clear ar1:"+ar1);

	}

}
