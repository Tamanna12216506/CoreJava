package intermediateStringAssisment;
import java.util.*;
import java.util.Map.Entry;

public class NonRepeatingChar {
	public static void nonRepeatingChar(String s) {
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char c:s.toCharArray()) {
			hm.put(c,hm.getOrDefault(c,0)+1);
		}
		for(Entry<Character, Integer> et:hm.entrySet()) {
			if(et.getValue()==1) {
				System.out.println(et.getKey());
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		nonRepeatingChar(s);
		sc.close();
		}

}
