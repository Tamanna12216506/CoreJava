package ArrayAssesment;

import java.util.Scanner;

public class ArrayInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		int [] arr=new int[n+1];
		System.out.println("Insert Element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter element and position");
		int ele = sc.nextInt();
		int pos = sc.nextInt();
		for(int i=n;i>pos;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos]=ele;
		System.out.println("Updated Array ");
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
