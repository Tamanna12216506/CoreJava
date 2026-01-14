package ArrayAssesment;

import java.util.Scanner;

public class ArrayPalindrome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Insert Element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Is array Palindrome: ");
		boolean isPal = false;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[n-1-i]) {
				isPal=true;
			}else {
				isPal=false;
			}
		}
		
		
	sc.close();
	}

}
