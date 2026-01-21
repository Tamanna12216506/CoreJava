package arrayListPrograms;

import java.util.ArrayList;

public class AddingData {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		al1.add(40);
		al1.add(50);
		al1.add(2,10); // list interface method putting data using index
		al1.add(al);  /// adding one collection to another , it will add in form of array
		al1.addAll(al);  ///it will add data of one collection to another
		
		System.out.println(al1);
		
		
		///for searching element
		System.out.println(al1.contains(30));
		System.out.println(al1.indexOf(30));

	}

}
