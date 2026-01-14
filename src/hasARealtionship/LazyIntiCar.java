package hasARealtionship;

public class LazyIntiCar {
	Tyre[] tyres = new Tyre[4];
	
	int i=0;
	////helper function
	void addtyre(Tyre tyre) {
		if(i<tyres.length) {
		tyres[i]=tyre;
		i++;
		}
	}
}
