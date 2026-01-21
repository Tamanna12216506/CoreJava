package arrayListPrograms;

import java.util.ArrayList;
import java.util.*;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s = new Student("Tanu",1);

		ArrayList student = new ArrayList();
		student.add(s);
		student.add(new Student("abc",21));
		student.add(new Student("xyz",22));
		student.add(new Student("def",23));
		student.add(new Student("ghi",24));
		student.add(new Student("jkl",25));
//		System.out.println("  "+student.remove(s)); ////for removing a object from collection
		
		Student searchEle = new Student("abc",21);
		System.out.println(student);
		System.out.println(student.contains(s));  /// it will check the reference after we add the element
		System.out.println(student.contains(searchEle));  /// it will check the properties without adding the element because we have override the equals method
		
		////Checking using single properties like id or name
		System.out.println("Enter the id to check:");
		int id = sc.nextInt();
		ListIterator<Student> i = student.listIterator();
		
		boolean found = false;
		
		while(i.hasNext()) {
			Student temp = i.next();
			if(temp.id==id) {
				found = true;
				System.out.println("Student exist");
				System.out.println("Student name: "+temp.name);

			}
		}
		if(!found) {
			System.out.println("Student does not exist");
		}
	}

}
