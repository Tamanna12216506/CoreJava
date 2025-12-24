package NumberLoopAssisment;

import java.util.Scanner;

public class SunnyQuestion {
	///sunny number =  a number where every digit factorial sum is equal to sum

	public static int fact(int a) {
		int prod = 1;
		for(int i=1;i<=a;i++) {
			prod = prod*i;
		}
		return prod;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int sum=0;
		while(n>0) {
			int rem = n%10;
			int a = fact(rem);
			sum +=a;
			n=n/10;
		}
		System.out.println("Is sunny number: "+(num==sum));
	}

}
