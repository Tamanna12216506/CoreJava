package setPrograms;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentTree>{

	@Override
	public int compare(StudentTree o1, StudentTree o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}

}
