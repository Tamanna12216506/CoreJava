package setPrograms;

import java.util.*;
public class StudentTreeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<StudentTree> st = new TreeSet<>(new StudentComparator());
		st.add(new StudentTree("Tamanna",11));
		st.add(new StudentTree("Tamaa",12));
		st.add(new StudentTree("Ta",15));
		st.add(new StudentTree("a",11));
		st.add(new StudentTree("T",18));
		System.out.println(st);
		

	}

}
