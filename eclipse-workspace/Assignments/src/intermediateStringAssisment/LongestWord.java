package intermediateStringAssisment;
import java.util.*;
public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] word = s.split("\\s+");
		String longestWord = "";
		for(String val:word) {
			if(val.length()>longestWord.length()) {
				longestWord = val;
			}
		}
		System.out.println(longestWord);
		sc.close();
	}
	

}
