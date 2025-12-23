package OperatorsAssesment;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantity = 9;
		boolean item = true;
		boolean disc = false;
		int inc = 9;
		
		
		boolean order = quantity>10 ||(item && !disc)?true:false;
		int totl = order?quantity += inc : quantity;
		
		System.out.println("Is order will be reorder: "+order+"\n total quantity: "+totl);
	}

}
