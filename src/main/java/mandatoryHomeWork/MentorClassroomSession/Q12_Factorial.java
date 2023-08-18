package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class Q12_Factorial {
	/*
	 * 1. input--> int
	   output--> int
		2. Testdata=5, edge=0  
		pse
		3. intialize variable fact=1,n=5
		4. Iterate from 1 to 5
		5. mutltiply with each value with fact then store the value into variable fact
		6. return fact
	 */
	@Test
	public void test1() {
		System.out.println(factorial(9999999));
		
	}
	
	public int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
		fact=fact*i;
		}
		return fact;
		}
}
