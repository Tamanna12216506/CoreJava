package Input;
import java.util.*;

public class AlphabetPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char alp = sc.next().charAt(0);
		
		if(alp=='a'|| alp=='A') {
			System.out.print("Apple");
		}
		else if(alp == 'b'|| alp=='B') {
			System.out.println("Ball");
		}
		else if(alp == 'c'|| alp=='C') {
			System.out.println("Cat");
		}
		else if(alp == 'd'|| alp=='D') {
			System.out.println("Dog");
		}else {
			System.out.println("None");
		}
		sc.close();
	}
}
