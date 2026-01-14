package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num/5==0 && num/11==0) {
			System.out.println("Number is divisble by 5 and 10");
		}
		System.out.print("Not divisble");
		
		sc.close();

	}

}
