package ArrayAssesment;

import java.util.Scanner;

public class EvenIndexElement {

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
		System.out.println("Even index element");
		for(int i=0;i<n;i=i+2) {  ////or u can also divide the i value with 2
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
