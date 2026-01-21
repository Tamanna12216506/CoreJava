package advancedStringPrograms;
import java.util.*;
public class containDigit {
	public static boolean digitOnly(String s) {
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]>'0') || !(ch[i]<'9')) {
				if(ch[i]==' ') {
					continue;
				}

				return false;
			}
		}
		return true;
//		for(int i=0;i<s.length();i++) {
//			if(!Character.isDigit(s.charAt(i))) {
//				return false;
//			}
//		}
//		return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Contain digit only "+digitOnly(s));
		sc.close();
				
	}

}
