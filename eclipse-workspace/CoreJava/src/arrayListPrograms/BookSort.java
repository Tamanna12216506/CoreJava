package arrayListPrograms;

public class BookSort implements Comparable<BookSort>{
	private int id;
	BookSort(int id){
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Book [Id="+id+"]";
	}
	

	@Override
	public int compareTo(BookSort o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

	

}
