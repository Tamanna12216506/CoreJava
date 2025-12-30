package StarPatterns;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(j==num || i==num)
				System.out.print("* ");
				else {
					System.out.print("  "); // here we have to give space two time beacsue we are giving space after printing star above
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
