package ExceptionHandling;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<=16) {
			throw new UnderAgeException("Age of voting is more than 16.");
		}else if(age>41) {
			throw new OverAgeException("Age of voting is less than 42");
		}else {
			System.out.println("You are eligible for voting");
		}
		
		sc.close();
	}

}
