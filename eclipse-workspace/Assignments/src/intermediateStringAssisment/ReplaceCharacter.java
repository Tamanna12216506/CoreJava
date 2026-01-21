package intermediateStringAssisment;
import java.util.*;

public class ReplaceCharacter {
	public static void replaceChar(String s,char c,char p) {
			char[] ch = s.toCharArray();
			for(int i=0;i<ch.length;i++) {
				if(ch[i]==c) {
					ch[i]=p;
				}
				System.out.print(ch[i]);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = sc.next().charAt(0);
		char p = sc.next().charAt(0);
		replaceChar(s,c,p);
		sc.close();
	}

}
