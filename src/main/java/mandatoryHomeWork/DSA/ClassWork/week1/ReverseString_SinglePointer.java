package mandatoryHomeWork.DSA.ClassWork.week1;

public class ReverseString_SinglePointer {

	public static void main(String[] args) {
		String s="geetha"; 
		char temp=' ';
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(i<s.length()-(i+1)) {
			temp=ch[i];
			ch[i]=ch[s.length()-(i+1)];
			ch[s.length()-(i+1)]=temp;
		}
		}
		
		System.out.println(String.valueOf(ch));

	}

}
