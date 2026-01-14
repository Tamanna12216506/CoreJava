package Operators;

public class DIvisbleLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =11 ;
		String ans = (a%3==0 && a%5==0)?"Divisble by both":(a%3==0&&a%5!=0)?"Divisble by 3":(a%3!=0&&a%5==0)?"Divisble by  5":"Divisble by none";
		System.out.println(ans);
	}

}
