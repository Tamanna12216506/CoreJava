package OperatorsAssesment;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speedl = 60;
		int vehicles =50;
		boolean driver = true;
		int totl =0;
		int finev = 200;
		
		String fine = speedl>vehicles && driver?"Fined":"Not Fined";
			int ans = fine =="Fined"?totl += finev:totl;
			System.out.println("Vehcile is "+fine+ " total amount is "+ans);
	}

}
