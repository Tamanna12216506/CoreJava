package Input;
import java.util.*;

public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	////taking student 
			Scanner sc = new Scanner(System.in);
			String name=sc.nextLine();
			char grade = sc.next().charAt(0);
			int age=sc.nextInt();
			double marks=sc.nextDouble();
			boolean pass=sc.nextBoolean();
			System.out.print("Name: "+name+"\nAge: "+age+"\nMarks: "+marks+"\nPass: "+pass+"\ngrade: "+grade);
			
			sc.close();
	}

}
