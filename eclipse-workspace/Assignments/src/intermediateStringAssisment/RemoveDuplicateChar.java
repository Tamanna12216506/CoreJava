package intermediateStringAssisment;

//import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar {
	public static void removeDuplicate(String s) {
//		char[] ch1 = new char[s.length()];
//		char[]ch = s.toCharArray();
//		Arrays.sort(ch);
//		int j =0;
//		ch1[j++]=ch[0];
//		for(int i=1;i<ch.length;i++) {
//			if(ch[i]!=ch[i-1]) {
//				ch1[j++]=ch[i];
//			}
//		}
//		for(int i=0;i<ch1.length;i++) {
//			System.out.print(ch1[i]);
//		}
		
		////using LinkedHashSet
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		for(char c:set) {
			System.out.print(c);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		removeDuplicate(s);
		sc.close();
	}

}
