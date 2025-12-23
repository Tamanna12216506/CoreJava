package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String req = sc.next();
		req.toLowerCase();
		
		switch(req) {
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;	
		case "div":
			System.out.println(a/b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		case "mod":
			System.out.println(a%b);
			break;
		default:
			System.out.println("Enter valid input");
		
		}
		}

}
