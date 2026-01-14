package hasARealtionship;

public class Car1 {
	////when tyre is public
//	 Tyre[] tyres = {new Tyre("MRF"),new Tyre("YMK"),new Tyre("xyz"),new Tyre("ABC")};
	
	////when tyre is private
	private Tyre[] tyres = {new Tyre("MRF"),new Tyre("YMK"),new Tyre("xyz"),new Tyre("ABC")};

	public Tyre[] getTyres() {
		return tyres;
	}

	public void setTyres(Tyre[] tyres) {
		this.tyres = tyres;
	}

	
}
