package DecisionMakingAssisment;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Character is vowel");
		}else {
			System.out.println("Consonant");
		}
		sc.close();
	}

}
