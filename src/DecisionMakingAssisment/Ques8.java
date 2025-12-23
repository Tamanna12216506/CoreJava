package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double mark1=sc.nextDouble();
		double mark2=sc.nextDouble();
		double mark3=sc.nextDouble();
		double mark4=sc.nextDouble();
		double mark5=sc.nextDouble();
		
		double percent = ((mark1+mark2+mark3+mark4+mark5)/500)*100;
		
		if(percent>=90.0) {
			System.out.println('O');
		}else if(percent>=80&&percent<90) {
			System.out.println('A');

		}else if(percent>=70&&percent<80) {
			System.out.println('A');

		}else if(percent>=60&&percent<70) {
			System.out.println('B');

		}else if(percent>=50&&percent<60) {
			System.out.println('C');

		}
		else {
			System.out.println('D');

		}
		sc.close();

	}

}
