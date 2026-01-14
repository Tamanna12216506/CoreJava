package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		
		switch(month) {
		case "February":
			System.out.println("Number of days in "+month+" 28 days");break;
		case "April":
		case "June":
		case "September":
		case "November":
			System.out.println("Number of days in "+month+" 30 days");break;
		default:
			System.out.println("Number of days in "+month+" 31 days");

			
		}
		sc.close();
		

	}

}
