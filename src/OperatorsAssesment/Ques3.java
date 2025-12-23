package OperatorsAssesment;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rating = 5;
		int exp =9;
		int incre =100;
		int salary =1000;
		boolean action = true;
		
		String res =  !action&&(rating>4)|| (exp>5)?"Eligible":"Not Elgible";
		int ans  = res=="Eligible"?salary += incre:salary;
		System.out.println("Employee is "+res + " and its current salary is "+ans);

	}

}
