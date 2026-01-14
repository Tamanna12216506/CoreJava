package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		if(a==0) {
			System.out.print("Number is Zero");
		}else if(a>0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is negative");
		}
		sc.close();
	}

}
