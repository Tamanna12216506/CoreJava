package Array;

import java.util.Scanner;

public class DynamicInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");

		int n=sc.nextInt();		
		int[] arr = new int[n];
		
		System.out.println("Insert Elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
sc.close();
	}

}
