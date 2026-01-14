package EncapsulationAssesment;

public class OnlineShopping {

	private int totalAmount=0,items=0;
	OnlineShopping(int totalAmount,int items){
		this.totalAmount=totalAmount;
		this.items=items;
	}
	
	public void add(int items,int totalAmount) {
		items+=items;
		totalAmount+=totalAmount;
		System.out.println("Item has been added.");
	}
	public void delete(int items,int totalAmount) {
		if(items>0&& totalAmount>0) {
		this.items-=items;
		this.totalAmount-=totalAmount;
		System.out.println("Item has been deleted.");
		}else {
			System.out.println("No item to delete");
		}
	}
	public int getItem() {
		return items;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public static void main(String[] args) {
		OnlineShopping os = new OnlineShopping(500,5);
		os.add(1, 100);
		os.delete(2, 300);
		System.out.println(os.getItem());
		System.out.println(os.getTotalAmount());
	}

}
