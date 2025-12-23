package StarPatterns;

import java.util.Scanner;

public class StarPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==n-1) {  ///use another method i==j use ai for finding this soln
					System.out.print("*");
				}else {
					System.out.print(" ");

				}
			}
		
		System.out.println();
		}
	}

}
