package hasARealtionship;

public class UniversityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///calling static method
		University.showUniversityName();
		University std = new University("Tanu");
		University std1 = new University("Tamanna");

		System.out.println("Studnt name: "+std.getStudentName());
		System.out.println(std.d.getDepartDetail());
		System.out.println("Student name: "+std1.getStudentName());
		System.out.println(std1.getDepartment().getDepartDetail());
	}

}
