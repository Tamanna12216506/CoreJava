package OperatorsAssesment;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int purchs = 300;
		String member = "Premium";
		boolean val = true;
		int dis  = 300;
		
		boolean ans =(purchs>2000 && member == "Premium") || !val?true:false;
		int res = ans?purchs -= dis:purchs;
		
		System.out.println("Is discount possible: "+ans+"\nFinal amount "+res);
	}

}
