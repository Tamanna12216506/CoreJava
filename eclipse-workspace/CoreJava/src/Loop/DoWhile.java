package Loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
	
		do {
			System.out.println("Welcome \nDO you want me to pritn again.\nType 'y' for Yes and 'n' for NO");
			ch = sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		sc.close();

	}
	
}
