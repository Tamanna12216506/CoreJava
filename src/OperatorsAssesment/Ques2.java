package OperatorsAssesment;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balnce=1000;
		String acnt = "active";
		int withdraw =200;
		String ans = (balnce>0)&&(acnt=="active")?"withdrawal":"You cannot withdraw";
		int res = ans=="withdrawal"&&balnce>=withdraw?balnce -= withdraw:balnce; 
		System.out.print(ans +" \nbalance in account "+res);

	}

}
