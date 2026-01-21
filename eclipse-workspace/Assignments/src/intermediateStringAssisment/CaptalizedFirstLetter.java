package intermediateStringAssisment;

import java.util.Scanner;

public class CaptalizedFirstLetter {
	public static String capitalLetter(String s) {
		if(s.length()==0) return s;
		char[] ch = s.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);
		return new String(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String [] word = s.split("\\s+");
		for(String val:word) {
			System.out.print(capitalLetter(val)+" ");
		}
		sc.close();
		
	}

}
