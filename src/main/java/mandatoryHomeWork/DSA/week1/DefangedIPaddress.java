package mandatoryHomeWork.DSA.week1;

public class DefangedIPaddress {

	public static void main(String[] args) {
		

		String address = "1.1.1.1";
		String shiftchar="";
		char[] ch = address.toCharArray();
		for (int j = 0; j < ch.length; j++) {
			if(ch[j]=='.') {
				shiftchar=shiftchar+"[.]";
			}
			else {
				shiftchar=shiftchar+ch[j];
			}
		}	
		System.out.println(shiftchar);

}}
