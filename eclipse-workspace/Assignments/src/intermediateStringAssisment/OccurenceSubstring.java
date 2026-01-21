package intermediateStringAssisment;
import java.util.*;
public class OccurenceSubstring {
	public static void countOccurence(String s,String subString) {
		int index=0;
		int count=0;
		while((index=s.indexOf(subString, index))!=-1) {
			count++;
			index = index+subString.length();
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String subString = sc.next();
		
		countOccurence(s,subString);
		sc.close();
	}

}
