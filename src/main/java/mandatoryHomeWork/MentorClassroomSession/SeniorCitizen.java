package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
public class SeniorCitizen {
	@Test
	public void test1() {
		SeniorCitizen(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"});
	}

	public int SeniorCitizen(String[] str) {
		int count=0;
		for (int i = 0; i < str.length; i++) {
		String s=str[i].substring(11,13);
		int age=Integer.parseInt(s);
		if(age>60){
		count++;
		}
		}
		System.out.println(count);
		return count; 
	}

}
