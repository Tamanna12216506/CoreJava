package arrayListPrograms;

import java.util.Comparator;

public class BookComparator implements Comparator<BookSort>{

	@Override
	public int compare(BookSort o1, BookSort o2) {
		return o1.getId()-o2.getId();
	}
	

}
