package mandatoryHomeWork.DSA.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class Day4_FindAllNumbersDisappearedArray {
	
	 /* https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
	    1. Declare the list
	    2. Add the input in the set
	    3. Iterate with loop with the given length 
	    4. check whether the number is exist in set
	    	if not then add the number in the list
	   
	   Time complexity-->O[N]
	   space complexity-->O[N]

    */
	
	@Test
	public void test1() {
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
		Assert.assertEquals(findDisappearedNumbers, Arrays.asList(5,6));
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
       
        List<Integer> list =new ArrayList<Integer>();
        Set<Integer> set=new HashSet<Integer>();
        for(int n:nums){
            set.add(n);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
