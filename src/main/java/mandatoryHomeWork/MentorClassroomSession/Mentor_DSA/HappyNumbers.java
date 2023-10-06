package mandatoryHomeWork.MentorClassroomSession.Mentor_DSA;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class HappyNumbers {
	
	/* https://leetcode.com/problems/happy-number/submissions/1068434178/
	1. Declare the set and sum as 0 , remainder as 0
	2. Check the condition whether the given number is greater than 0
		if yes get the remainder of the given number 
		then take the square of the remainder(n%10) and add with sum
		then divide the given number and store it in the given variable name itself(n/10)
		the loop iterates take remainder(n%10) and quotient(n/10) still it the given number reaches 
	3. Each iteration check whether n reaches 0
		if yes assign the n to sum
		check whether the sum==1 If yes return true
		then also add the number in the set to check whether the number happy number or not 
		the reset the sum as 0
		
		Eg:--> 2(is not a happy number because when calculate the happy number as follows
				2,4,16,37,58,89,145,42,20,4-->it start with 4 again it reaching the 4
				So the loop continues it will not end
				because of that to break the condition we are adding the values in the set when we add the already exist number then the condition return false.

	*/
	
	

		@Test
		public void test1() {
			boolean happy = isHappy(19);
			Assert.assertEquals(happy, true);
		}
		
		@Test
		public void test2() {
			boolean happy = isHappy(2);
			Assert.assertEquals(happy, false);
		}
		
		 public boolean isHappy(int n) {
			 Set<Integer> set=new HashSet<Integer>();
				int rem=0,sum=0;
				while(n>=1) {
					rem=n%10;
					sum=sum+(rem*rem);
					n=n/10;
					if(n==0) {
						n=sum;
						if(sum==1) {
							return true;
						}
						if(!set.contains(sum)) {
							set.add(sum);
						}
						else {
							return false;
						}
						sum=0;

					}
				}
				
				return sum==1;
					
		    }

	}

