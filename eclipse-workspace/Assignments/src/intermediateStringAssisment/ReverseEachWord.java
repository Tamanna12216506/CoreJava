package intermediateStringAssisment;
import java.util.*;

public class ReverseEachWord {
	public static String revreseWord(String s) {
		char[] ch = s.toCharArray();
		char[] ch1 =new char[s.length()];
		int j=ch.length-1;
		int i=0;
		while(j>=0) {
			ch1[i]=ch[j];
			j--;
			i++;
		}
		return new String(ch1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] word = s.split(" ");
		for(String val:word) {
			System.out.print(revreseWord(val)+" ");
		}
		sc.close();

	}

}
