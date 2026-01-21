package advancedStringPrograms;
import java.util.*;

public class RemoveSpecialChar {
	public static void removeSpecial(String s) {
		 char [] ch = s.toCharArray();
		 for(int i=0;i<ch.length;i++) {
			 if(Character.isLetterOrDigit(ch[i])||ch[i]==' ') {
				 System.out.print(ch[i]);
			 }
//			 if(String.valueOf(ch[i]).matches("[a-zA-Z0-9]")) {
//				 System.out.print(ch[i]);
//
//			 }
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
//		String r  = s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(r);

		removeSpecial(s);
		sc.close();
	}

}
