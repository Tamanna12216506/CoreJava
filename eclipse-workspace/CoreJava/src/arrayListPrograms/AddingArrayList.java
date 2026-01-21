package arrayListPrograms;
import java.util.*;
public class AddingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
				al.add(sc.nextInt());
		}
		int sum=0;
		for(int i=0;i<al.size();i++) {
			sum+=al.get(i);
		}
		System.out.println(sum);

	}

}
