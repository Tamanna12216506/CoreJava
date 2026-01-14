package ArrayAssesment;

import java.util.Scanner;

public class SumArray {

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
		System.out.println("Sum of element in array");
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=arr[i];
			
		}
		System.out.print(sum);

		sc.close();
	}

}
