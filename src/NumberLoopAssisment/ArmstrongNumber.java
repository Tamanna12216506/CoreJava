package NumberLoopAssisment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int num = n;
		int sum=0;
		while(n>0) {
			int rem = n%10;
			int a = rem*rem*rem;
			sum +=a;
			n=n/10;
		}
		System.out.println("Number is armstrong number: "+(sum==num));
	}

}
