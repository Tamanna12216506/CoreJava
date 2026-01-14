package OperatorsAssesment;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Tamanna";
		String pass = "Tamanna";
		boolean accn = true;
		int count =8;
		
		boolean login = name=="Tamanna"&&pass =="Tamanna"&& accn?true:false;
		count++;
		boolean ans = count>5?true:false;
		boolean user = !ans&&login?true:false;
		
		System.out.println("Is login: "+user);
		
	}

}
