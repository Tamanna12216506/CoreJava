package OperatorsAssesment;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean chln = false;
		boolean adm = false;
		int antd = 8;
		int extr = 10;
		int dur = 60;
	
		
		boolean ans = chln || (antd<60 && adm)?true:false;
		int res = ans?dur += extr:dur;
		
		System.out.println(" IS student eligible for extra time: "+ans+"\n Total duration :"+res);
		

	}

}
