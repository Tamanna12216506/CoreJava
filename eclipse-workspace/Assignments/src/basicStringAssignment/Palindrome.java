package basicStringAssignment;

import java.util.Scanner;

public class Palindrome {
	public static String reverse(String str) {
		int i=0;
		int j=str.length()-1;
		char[] c = str.toCharArray();
		while(i<j) {
			char ch = c[i];
			c[i]=c[j];
			c[j] = ch;
			i++;
			j--;
		}
		return new String(c);
	}
	public static boolean palindrome(String str) {
		String a = reverse(str);
		if(a.equals(str)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(palindrome(s));
		sc.close();
	}

}
