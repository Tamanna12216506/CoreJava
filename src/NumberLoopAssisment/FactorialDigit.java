package NumberLoopAssisment;

import java.util.Scanner;

public class FactorialDigit {
	public static void fact(int a) {
		int prod =1;
		System.out.println("Factor of "+a);

		for(int i=1;i<=a;i++) {
			prod *=i;
			System.out.print(prod+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factor of every digit of number "+ n);
		
		while(n>0) {
			int rem = n%10;
			fact(rem);
			n=n/10;
		}
		sc.close();


	}

}
