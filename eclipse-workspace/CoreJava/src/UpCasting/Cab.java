package UpCasting;

import java.util.Scanner;

public class Cab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("You can select");
		System.out.println("1:Mini");
		System.out.println("2:Sedan");
		System.out.println("3:Luxury");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		Cab c= null;
		switch(choice) {
		case 1:{
			c= new Mini();
		}break;
		
		case 2:{
			c = new Sedan();
		}break;
		
		case 3:{
			c=new Luxury();
		}break;
		
		default:
			System.out.println("Invalid input");
		}
		
		System.out.println(c);
		sc.close();
	}

}
