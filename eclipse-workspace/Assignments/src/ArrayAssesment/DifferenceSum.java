package ArrayAssesment;

import java.util.Scanner;

public class DifferenceSum {

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
		int sum=0,oddsum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
			sum +=arr[i];
			}else {
				oddsum +=arr[i];
			}
			
		}
		System.out.println("Sum of even element in array: "+sum+"\nSum of odd Element: "+oddsum);
		if(sum>oddsum) {
		System.out.print(sum-oddsum);
		}else {
			System.out.print(oddsum-sum);
		
		}
		sc.close();
	}

}
