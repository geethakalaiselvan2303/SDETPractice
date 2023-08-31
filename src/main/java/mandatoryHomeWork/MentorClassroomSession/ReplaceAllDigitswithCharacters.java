package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class ReplaceAllDigitswithCharacters {
	
	@Test
	public void test1() {
		ReplaceAllDigitswithCharacters("a1c1e1");
	}

	public String ReplaceAllDigitswithCharacters(String s) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char shiftChar;
			char[] ch = s.toCharArray();
			if(Character.isDigit(ch[i])) {
				shiftChar=shift(ch[i-1],ch[i]);
			}
			else {
				shiftChar=ch[i];
			}
			sb.append(shiftChar);
			}
			return sb.toString();
		}
	
	
	public char shift(char ch1, char ch2) {
		
		char c= (char) (ch2-'0');
		char c1=(char) (ch1+c);
		return c1;
}

}