package NumberLoopAssisment;

import java.util.Scanner;

public class FactorDigit {
	
	public static void factornum(int a) {
		int i=1;
		 System.out.print("Factors of " + a + " :");
	        while(i<=a){
	            if (a % i == 0) {
	                System.out.print(i + " ");
	            }
			i++;
		}
	        System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Factor of every number in digit");

		while(n>0) {
			int rem = n%10;
			factornum(rem);
			n = n/10;
		}

	}

}
