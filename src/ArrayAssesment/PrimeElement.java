package ArrayAssesment;

import java.util.Scanner;

public class PrimeElement {
	public static boolean prime(int num) {
		int count=0,i=1;
		while(i<=num) {
			if(num%i==0) {
				count++;
			}
			i++;
		}
		boolean res = count<=2?true:false;
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
			System.out.println("Prime element in array");
			for(int i=0;i<n;i++) {
				if(prime(arr[i])) {
					System.out.println(arr[i]);
				}
			}
			sc.close();
	}

}
