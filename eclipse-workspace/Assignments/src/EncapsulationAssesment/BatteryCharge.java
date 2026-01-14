package EncapsulationAssesment;

public class BatteryCharge {
	private int batteryLevel;
	BatteryCharge(){
		
	}
	BatteryCharge(int batteryLevel){
		this.batteryLevel=batteryLevel;
	}
	public void chargeBattery() {
		if(batteryLevel<10) {
			System.out.println("Charge battery");
		}
	}
	public void useBattery() {
		if(batteryLevel>10) {
			System.out.println("You can use the battery");
		}
	}
	public static void main(String[] args) {
		BatteryCharge b = new BatteryCharge(25);
		b.chargeBattery();
		b.useBattery();
	}

}
