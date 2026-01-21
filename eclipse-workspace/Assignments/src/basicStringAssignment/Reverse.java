package basicStringAssignment;

public class Reverse {
	
	public static String reverse(String s) {
		int i=0;
		int j=s.length()-1;
		char[] c = s.toCharArray();
		while(i<j) {
			char temp = c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Tamanna";
		String s1 = new String("Tanu");
		System.out.println(reverse(s));
		System.out.println(reverse(s1));


	}

}
