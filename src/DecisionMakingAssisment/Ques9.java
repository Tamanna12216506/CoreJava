package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(a==b && b==c) {
			System.out.println("Equivalteral Triangle");
		}else if(a!=b && b!=c) {
			System.out.print("Scalene Triangle");
		}else {
			System.out.print("Isoscles Triangle");
		}
		sc.close();
		
	}

}
