package mandatoryHomeWork.DSA.week5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Day2_TimeNeededToBuyTickets {
	
	/*  https://leetcode.com/problems/time-needed-to-buy-tickets/
	 *  1. Convert the arrays to list
	 *  2. Iterate with list check the the list size is >0
	 *  3. start with the k index
	 *  4. check for the condition if the values is zero then remove the value from the list
	 *  5. iterate the still the list size is zero
	 *  6. return the count
	 *  
	 *  Time complexity--->O[n^2]
	 *  space complexity-->O[n]
	 * 
	 */
	
	@Test
	public void test1() {
		timeRequiredToBuy(new int[] {5,1,1,1},0);
	}
	
	public int timeRequiredToBuy(int[] tickets, int k) {
		int count=0;
		List<Integer> list=new ArrayList<Integer>();
		for (int n : tickets) {
			list.add(n);
		}
		int orginalValues=0,result;
		while(list.get(k)!=0) {
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i)!=0) {
					orginalValues = list.get(i);
					result=orginalValues-1;
					list.set(i, result);
					count++;
					if(list.get(k)==0) {
						return count;
					}
				}
				
			}
		}
		return count;
        
    }

}
