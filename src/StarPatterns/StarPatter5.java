package StarPatterns;

import java.util.Scanner;

public class StarPatter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int  i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0 || j==num-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
