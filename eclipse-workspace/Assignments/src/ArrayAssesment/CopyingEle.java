package ArrayAssesment;

import java.util.Scanner;

public class CopyingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Insert element of first array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter size of second array");
		int m = sc.nextInt();
		int arr1[]= new int[m];
		System.out.println("Insert element of second array");
		for(int i=0;i<m;i++) {
			arr1[i]=sc.nextInt();
		}
		arr1[m-1]=arr[3];
		for(int i=0;i<m;i++) {
			System.out.print(arr1[i]+" ");
		}
		sc.close();
	}

}
