package NumberLoopAssisment;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///neon number =  where number square value have digit and those digit sum is equal to that particular number
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int sq = n*n;
		int sum = 0;
		while(sq>0) {
			int rem = sq%10;
			sum += rem;
			sq=sq/10;
		}
		System.out.print("Is number is neon : "+(sum==num));
		sc.close();

	}

}
