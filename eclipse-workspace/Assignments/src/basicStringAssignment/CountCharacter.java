package basicStringAssignment;

public class CountCharacter {
	public static int countChar(String s) {
		char[] c = s.toCharArray();
		int count =0;
		for(char ch:c) {
			if(ch==' ') {
				continue;
			}
			count++;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		System.out.println(countChar(s));

	}

}
