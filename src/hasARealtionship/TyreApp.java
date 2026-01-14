package hasARealtionship;

public class TyreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 c = new Car1();
		///for public function
//		for(int i=0;i<c.tyres.length;i++) {
//			System.out.println(c.tyres[i].getTyre);
//		}
		
		////for private function
		for(int i=0;i<c.getTyres().length;i++) {
			System.out.println(c.getTyres()[i].getTyre());
		}

	}

}
