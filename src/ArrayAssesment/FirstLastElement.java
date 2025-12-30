package ArrayAssesment;

import java.util.Scanner;

public class FirstLastElement {

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
		System.out.println("First element in array: "+arr[0]);
		System.out.println("Last element in array: "+arr[n-1]);

		sc.close();
	}

}
