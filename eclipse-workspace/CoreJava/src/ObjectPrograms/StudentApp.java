package ObjectPrograms;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student("X234");
		Student s3 = new Student("ob234","12345");
		Student s4 = new Student("YVFG34","08665e34","52497");
		
		System.out.println("Student details");
		System.out.println("Student 1 pan number "+s1.pan+" addhar number "+s1.adhar+" voting number "+s1.voting);
		System.out.println("Student 2 pan number "+s2.pan+" addhar number "+s2.adhar+" voting number "+s2.voting);
		System.out.println("Student 3 pan number "+s3.pan+" addhar number "+s3.adhar+" voting number "+s3.voting);
		System.out.println("Student 4 pan number "+s4.pan+" addhar number "+s4.adhar+" voting number "+s4.voting);

	}

}
