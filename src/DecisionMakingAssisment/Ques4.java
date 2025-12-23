package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if((num&1)==0) {
			System.out.println("Number  is even");
		}else {
		System.out.println("Number is Odd");
		}
		sc.close();
	}

}
