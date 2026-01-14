package ObjectClass;


/////overriding of string method
public class PhonePart {
	private int ram,rom;
	PhonePart(){
		
	}
	PhonePart(int ram,int rom){
		this.ram=ram;
		this.rom=rom;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	
}
