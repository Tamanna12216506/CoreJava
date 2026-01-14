package ArrayAssesment;

import java.util.Scanner;

public class ArmstrongNumber {
	public static boolean armstrng(int num) {
		int n= num;int cnt=0;
		int temp=num;
		while(n>0) {
			int rem = n%10;
			cnt++;
			n=n/10;
		}
		int sum =0;
		while(num>0) {
			int rem = num%10;
			sum += Math.pow(rem, cnt);
			num = num/10;
		}
		boolean res = sum==temp?true:false;
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
		System.out.println("ArmStrong Number in array.");
		for(int i=0;i<n;i++) {
			if(armstrng(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		
		sc.close();
	}

}
