package intermediateStringAssisment;

import java.util.Arrays;

public class DuplicateString {

	public static void duplicateString(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;) {
			int count=1;
			while(i+count<ch.length&&ch[i]==ch[i+count]) {
				count++;
			}
			if(count>1) {
				System.out.println("Duplicate object is : "+ch[i]);
			}
			i+=count;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Tamanna";
		duplicateString(s);
	}

}
