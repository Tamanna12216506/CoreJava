package NumberLoopAssisment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int num = n;
		int temp=n;
		int sum=0;
		int count=0;
		while(temp>0) {
			int rem = n%10;
			count++;
			temp=temp/10;
		}
		while(n>0) {
			int rem = n%10;
			int a = (int) Math.pow(rem, count);
			sum +=a;
			n=n/10;
		}
		System.out.println("Number is armstrong number: "+(sum==num));
		sc.close();

	}

}
