package hasARealtionship;

public class University {
	private String studentName;
	private static String uniName = "LPU";
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	University(){
		
	}
	University(String studentName){
		this.studentName=studentName;
	}
	
	///Has-A relationship
	Department d = new Department("ECE");
	private Department d1 = new Department("CSE",27);

	public Department getDepartment() {
		return d1;
	}
	public static void showUniversityName() {
		System.out.println("University Name is "+uniName);
	}

}
