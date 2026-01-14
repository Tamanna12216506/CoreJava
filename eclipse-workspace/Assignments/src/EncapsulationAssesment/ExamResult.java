package EncapsulationAssesment;

public class ExamResult {
	private double result;
	ExamResult(){
		
	}
	ExamResult(double result){
		this.result=result;
	}
	public double result(int sub1,int sub2) {
		result = (sub1+sub2)/2;
		return result;
	}
	
	public static void main(String[] args) {
		ExamResult e = new ExamResult();
		System.out.println(e.result(10, 20));
	}
	

}

