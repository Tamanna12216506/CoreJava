package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.print("Character is in lowercase");
		}else if(ch>='A'&&ch<='Z') {
			System.out.print("Character is in uppercase");
			
		}else if(ch>='0' && ch<= '9') {
			System.out.print("Character is in Digit");

		}else {
			System.out.print("Character is special character");
		}
		sc.close();
	}

}
