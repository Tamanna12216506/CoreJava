package ObjectClass;

public class Phone {
		PhonePart[] phone = {new PhonePart(4,5),new PhonePart(6,4),new PhonePart(7,8)};
		
		public String toString() {
			String result="";
			for(int i=0;i<phone.length;i++) {
			result = result+ "Phone ram: "+phone[i].getRam()+" rom "+phone[i].getRom()+"\n";
			}
			return result;
		}
		

}
