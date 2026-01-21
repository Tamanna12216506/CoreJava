package arrayListPrograms;
import java.util.*;

public class BookSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BookSort> bk = new ArrayList();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int  id = sc.nextInt();
			bk.add(new BookSort(id));
		}
		System.out.println(bk);
		Collections.sort(bk);   ///here compareTo method is called
		System.out.println(bk);
		Collections.sort(bk,new BookComparator());
		System.out.println(bk);
		
//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add(20);
//		a.add("Hello");
//		Collections.sort(a); ///  throw exception ClassCastException
	}

}
