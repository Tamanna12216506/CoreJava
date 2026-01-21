package advancedStringPrograms;
import java.util.*;
public class RotatingString {
	public static boolean stringRotation(String s,String s1) {
		if(s.length()!=s1.length()) return false;
		String temp = s+s1;
		if(temp.contains(s1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		System.out.println("String rotation of each other "+stringRotation(s,s1));
		}

}
