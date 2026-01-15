package ExceptionHandling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a = sc.nextInt();		
		System.out.println("Enter second value");
		int b = sc.nextInt();
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Caught");
		}
		catch(NullPointerException | NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NullPointer and NumberFormat Exception");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Another Exception");
		}
		finally {
			///important statement which we want to execute
			System.out.println("Done");
		}
		sc.close();
	}

}
