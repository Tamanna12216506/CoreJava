package NumberLoopAssisment;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///A number whose product and sum is equal
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0,prod =1;
		while(n>0) {
			int rem = n%10;
			sum += rem;
			prod *= rem;
			n=n/10;
		}
		if(sum==prod) {
			System.out.print("Input is a Spy Number.");
		}else {
			System.out.print("Input is not a Spy Number.");
		}

	}

}
