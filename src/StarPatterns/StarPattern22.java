package StarPatterns;

import java.util.Scanner;

public class StarPattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<n*2;i++) {
			for(int j=1;j<=n;j++) {
				if(j>=i || i+j>=n*2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
