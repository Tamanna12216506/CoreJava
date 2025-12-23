package OperatorsAssesment;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score =190;
		boolean level =true;
		boolean usecheat =false;
		int bonus =10;
		
		boolean elgible = score>100&& level && !usecheat?true:false;
		int value = elgible?score += bonus:score;
		System.out.println("Is player eligible: "+elgible+("\nplayer score is: ")+value);
		
	}

}
