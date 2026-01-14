package NumberLoopAssisment;

import java.util.Scanner;

public class ProductDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int product = 1;
		while(n>0) {
			int rem = n%10;
			product *= rem;
			n=n/10;
		}
		System.out.println(product);
		sc.close();

	}

}
