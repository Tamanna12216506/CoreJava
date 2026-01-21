package setPrograms;
import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lset = new LinkedHashSet();
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		System.out.println("Set 1 "+lset);
		
		LinkedHashSet lset1 = new LinkedHashSet();
		lset1.add(20);
		lset1.add(21);
		lset1.add(30);
		lset1.add(31);
		System.out.println("Set 2 "+lset1);
		System.out.println(lset.contains(10));
		System.out.println("After remove all "+lset.removeAll(lset1));
		System.out.println("Set 1 "+lset);
		System.out.println("Set 2 "+lset1);
		System.out.println("After retain all "+lset1.retainAll(lset));

		

	}

}
