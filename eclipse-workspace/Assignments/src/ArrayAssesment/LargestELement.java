package ArrayAssesment;

import java.util.Scanner;

public class LargestELement {

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
		int a = arr[0];
		for(int i=1;i<n;i++) {
			///a = Math.max(a,arr[i]);
			if(arr[i]>a) {
				a=arr[i];

			}
		}
		System.out.println("Largest Element: "+a);
		sc.close();
	}

}
