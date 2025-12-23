package OperatorsAssesment;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=96;
		int atnd = 78;
		String ans  = (marks>=40)&&(atnd>75)?"Pass":"Fail";
		int res = ans=="Pass"&&marks<=95?marks+=5:marks;
		
		System.out.print(ans+" ");
		System.out.println("marks are "+res);

	}

}
