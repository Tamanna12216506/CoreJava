package EncapsulationAssesment;

public class VehicleSpeed {
	private int speed;
	VehicleSpeed(){
		
	}
	VehicleSpeed(int speed){
		this.speed=speed;
	}
	public void increaseSpeed(int value) {
		if(speed+value<150) {
			speed+=value;
		}else {
			speed=149;
			System.out.println("Speed is already max");
		}
	}
	public void decreaseSpeed(int value) {
		if(speed-value>0) {
			speed-=value;
		}else {
			speed = 1;
			System.out.println("Speed is already minimum");
		}
	}
	public int getSpeed() {
		return speed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleSpeed v = new VehicleSpeed(40);
		v.increaseSpeed(20);
		System.out.println("Current speed "+v.getSpeed());
		v.increaseSpeed(52);
		System.out.println("Current speed "+v.getSpeed());
		v.decreaseSpeed(10);
		System.out.println("Current speed "+v.getSpeed());

	}

}
