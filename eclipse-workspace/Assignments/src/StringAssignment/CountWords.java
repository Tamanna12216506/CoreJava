package StringAssignment;

public class CountWords {
	public static int countWords(String str) {
		int count=0;
		String[] st = str.split("\\s++"); /// for more than one space
		for(String s:st){
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello how ffr f rfrfdjdd ";
		System.out.println(countWords(s));
	}

}
