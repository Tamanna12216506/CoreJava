package NumberLoopAssisment;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1,fact =1;
		while(i<=n) {
			fact *=i;
			i++;
		}
		System.out.println("Factorial of number "+n+" is "+fact);
	}

}
