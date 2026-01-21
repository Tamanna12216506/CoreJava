package basicStringAssignment;

import java.util.Scanner;

public class ReplaceChar {
	public static void replaceChar(String s,char oldChar,char newChar) {
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==oldChar) {
				ch[i]=newChar;
			}
			System.out.print(ch[i]);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		System.out.println("Enter char to replace");
		char oldChar = sc.next().charAt(0);
		System.out.println("Enter char");
		char newChar = sc.next().charAt(0);
		replaceChar(s,oldChar,newChar);
		
		sc.close();

	}

}
