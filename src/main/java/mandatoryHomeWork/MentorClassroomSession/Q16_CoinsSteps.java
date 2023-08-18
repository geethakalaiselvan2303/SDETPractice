package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class Q16_CoinsSteps {
	
	/* steps=10
		1. Initialize the variable count=0
		2. Iterate still the condition is noOfRows<=steps then the add the count plus index
		3. check for the condition noOfRows<=steps 
		4. if yes return count++  
	 */

	@Test
	public void test1() {
		System.out.println(CoinsSteps(10));
	}
	
	@Test
	public void test2() {
		System.out.println(CoinsSteps(5));
	}
	
	@Test
	public void test3() {
		System.out.println(CoinsSteps(9));
	}

	public int CoinsSteps(int steps) {
		int count=0,noOfRows=0;
		for(int i=1;i<=steps;i++){
		noOfRows=noOfRows+i;
		if(noOfRows<=steps){
		count++;
		}
		}
		return count;
	}
}
