package MandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class NummberOfOcuranceLargestKey {
	
	@Test
	public void test1() {
		int noOfOcurance = noOfOcurance(new int[] {1, 1, 2, 2, 2, 2, 3,},3);
		Assert.assertEquals(1, noOfOcurance);
	}

	public int noOfOcurance(int[] n,int target) {
		int count=0;
		for (int i = 0; i < n.length; i++) {
			if(n[i]==target) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

}
