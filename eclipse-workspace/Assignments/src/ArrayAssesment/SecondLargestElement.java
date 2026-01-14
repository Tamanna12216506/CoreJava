package ArrayAssesment;

import java.util.Scanner;

public class SecondLargestElement {

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
		int largest = arr[0];
		int secondlarge = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				secondlarge = largest;
				largest = arr[i];
			}else if(arr[i]>secondlarge&&arr[i]!=largest){
				secondlarge = arr[i];
			}
		}
		System.out.println("Second Largest Number in array: "+secondlarge);
		sc.close();
	}

}
