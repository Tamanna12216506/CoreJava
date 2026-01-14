package ArrayAssesment;

import java.util.Scanner;

public class EvenElement {

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
		System.out.println("Even element in array");
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}

}
