package intermediateStringAssisment;

import java.util.Arrays;

public class FrequencyChar {
	public static void frequencyChar(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;) {
			int count=1;
			while(i+count<ch.length && ch[i]==ch[i+count]) {
				count++;
			}
			if(count>1) {
				System.out.println("Duplicate element "+ch[i]+" and count is "+count);
			}
			i+=count;
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Tamanna";
		frequencyChar(s);

	}

}
