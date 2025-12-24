package NumberLoopAssisment;

import java.util.Scanner;

public class FactorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		System.out.println("Factors of "+n);
		while(i<=n) {
			if(n%i==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
