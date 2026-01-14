package EncapsulationAssesment;

public class StudentMarks {
	
	private int marks;
	StudentMarks(){
		
	}
	StudentMarks(int marks){
		this.marks=marks;
	}
	public void setMarks(int marks) {
		if(marks<100) {
		this.marks=marks;
		}else {
			System.out.println("Marks should be less than 100");
		}
	}
	public int getMarks() {
		return marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks st = new StudentMarks(50);
		System.out.println(st.getMarks());
	}

}
