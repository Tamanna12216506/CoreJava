package StringAssignment;

public class EqualAndSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="tamanna hllooo ";
		String st = "tamanna";
		String st1 = new String("tamanna");
		
		String[] s = str.split("\\s++");/// removing space
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println(st1==st);
		System.out.println(st1.equals(st));
	}

}
