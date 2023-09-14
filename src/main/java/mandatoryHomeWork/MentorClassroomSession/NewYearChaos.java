package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NewYearChaos {

	/*
	 * https://www.hackerrank.com/challenges/new-year-chaos
	 * 
	 * 1. Declare the j=1 and boolean flag=true 
	 * 2. Iterate with list 
	 *    Get the index value of each position of list and j=1 
	 *    check for the condition whether difference >2 
	 *    If yes then set the flag is true break the loop increment the j value 
	 * 3. if flag =false the print "Too chaotic" 
	 * 
	 *  movements count for different values  
	 * 4. Iterate from the index from last
	 * 		if index value is lesser then increment count
	 * 		iterate the still the index=0 then return the count
	 *   
	 *   Time Complexity--->o[n2]   
	 */

	@Test
	public void test1() {
		newYearChaos(Arrays.asList(2, 1, 5, 3, 4));
	}

	public void newYearChaos(List<Integer> list) {
		int j = 1;
		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			int value = list.get(i) - j;
			if (value > 2) {
				flag = false;
				break;
			}
			j++;
		}
		if (flag == false) {
			System.out.println("Too chaotic");
		} else {
			System.out.println(bribesCount(list));
		}
	}

	public int bribesCount(List<Integer> q) {
		int count = 0;
		for (int i = q.size() - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (q.get(i) < q.get(j)) {
					count++;
				}
			}
		}
		return count;

	}

}
