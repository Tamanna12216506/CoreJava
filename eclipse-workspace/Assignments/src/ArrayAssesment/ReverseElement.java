package ArrayAssesment;

import java.util.Scanner;

public class ReverseElement {
	public static int reversefun(int num) {
		int sum=0;
		while(num>0) {
			int rem = num%10;
			sum = sum*10+rem;
			num = num/10;
		}
		return sum;
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
		System.out.println("Reversing each element in array");
		for(int i=0;i<n;i++) {
			int a = reversefun(arr[i]);
			System.out.print(a+" ");
		}
		
		sc.close();
		
		
	}

}
