package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c = sc.nextInt();
		
	
		if(a>b&&a>c) {
			System.out.println(a+" is larger number");
		}
		else if(b>c&&b>a) {
			System.out.println(b+" is larger number");
			
		}else {
			System.out.println(c+" is larger number");

		}
		sc.close();

	}

}
