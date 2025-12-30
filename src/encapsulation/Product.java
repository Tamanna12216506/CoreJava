package encapsulation;

public class Product {

		private int price;

	
	public void setter(int price) {
		//validation
		if(price>0) {
			this.price=price;
		}
	}
	public int getter() {
		return price;
	}

}
