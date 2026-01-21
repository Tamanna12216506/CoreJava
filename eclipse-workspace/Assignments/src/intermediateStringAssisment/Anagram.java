package intermediateStringAssisment;

import java.util.Arrays;

public class Anagram {
	public static boolean anagramFun(String s,String s1) {
		if(s.length()!=s1.length()) {
			return false;
		}
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		char[] ch = s.toCharArray();
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=ch1[i]) {
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Eightt";
		String s1 = "Height";
		System.out.println("Two string are Anagram are "+anagramFun(s,s1));
		

	}

}
