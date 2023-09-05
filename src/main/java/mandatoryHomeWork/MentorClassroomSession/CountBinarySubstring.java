package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class CountBinarySubstring {
	
	/*	
		// 00110011
		1. Declare current=1,previous=0,count=0;
		2. Split the character
		3. Iterate each character(start from 1st Index)
		4. check for the condition whether i and i-1 are equal
		5. if equal count++
		6. else assign the current=previous
		7. then decrement the current
		8. check for the condition previous>=current
		9. if yes count++
		10. return count
	 */
	
	@Test
	public void test1() {
		System.out.println(binaryCounting("00110011"));
	}
	
	public int binaryCounting(String s) {
		int current=1,previous=0,count=0;
		for(int i=1;i<s.length();i++){
		if(s.charAt(i-1)==s.charAt(i)){
		current++;
		}
		else{
		previous=current;
		current=1;}
		
		if(previous>=current) count++;
		
}
		return count;
	}

}
