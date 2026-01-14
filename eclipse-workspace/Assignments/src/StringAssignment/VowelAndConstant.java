package StringAssignment;

public class VowelAndConstant {
	
	public static int[] VowelConstantCount(String str) {
		int vowel = 0;
		int constant =0;
		for(int i=0;i<str.length();i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}else {
				constant++;
			}
		}
		return new int[] {vowel,constant};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Tamanonfujghfda";
		int[] result =VowelConstantCount(s);
		System.out.println("Vowel count is: "+result[0]+" Constant Count is: "+result[1]);
	}

}
