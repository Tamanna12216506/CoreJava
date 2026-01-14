package string;

public class StringMethods {
	public static void main(String[] arr) {
		String s1 = new String("Hi"); ///object will be created in heap as well as string constant pool area
		String s2 = "Hello";  //it only create object in string constant pool area
		System.out.println(s2.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("lo"));
		System.out.println(s1.charAt(0));
		char[] c = s2.toCharArray();
		System.out.println(c);
		String s3 = "Hi Hello Bye";
		String[] s = s3.split(" ");
		for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
		}
		System.out.println(s1.concat(s2));
		System.out.println(s2.substring(0,2));
	}
}
