package hasARealtionship;

public class LazyInitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyIntiCar lc = new LazyIntiCar();
		lc.addtyre(new Tyre("XYZ"));
		lc.addtyre(new Tyre("XYZ"));
		lc.addtyre(new Tyre("XYZ"));
		lc.addtyre(new Tyre("XYZ"));
		lc.addtyre(new Tyre("XYZ"));
		
		for(int i=0;i<lc.tyres.length;i++) {
			System.out.println(lc.tyres[i].getTyre());
		}
	}

}
