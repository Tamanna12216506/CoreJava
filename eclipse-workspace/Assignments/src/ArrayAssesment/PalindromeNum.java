package ArrayAssesment;

import java.util.Scanner;

public class PalindromeNum {
	public static boolean palindrome(int num) {
		int n=num;
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum = sum*10+rem;
			n=n/10;
		}
		boolean res = sum==num?true:false;
		return res;
	}

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
		System.out.println("Palindrome element in array");
		for(int i=0;i<n;i++) {
			if(palindrome(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}

}
