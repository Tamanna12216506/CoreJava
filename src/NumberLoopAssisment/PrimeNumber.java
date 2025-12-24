package NumberLoopAssisment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i=1,count=0;
		
		while(i<=n) {
			if(n%i==0) {
				count++;
			}
			i++;
			
		}
		if(count<=2) {
			System.out.println(n+" is a Prime number.");
		}else {
			System.out.println(n +" is not a Prime number.");

		}
	}

}
