package mandatoryHomeWork.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LeetcodePractice {
	
	@Test
	public void test1() {
		List<Integer> actOutput = findCaloriesPoint(new int[] {0,0,1,2,3});
		System.out.println(actOutput);
		Assert.assertEquals(actOutput, 0);
	}
	public List<Integer> findCaloriesPoint(int[] nums) {
		int count=0;
        int[] empty=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
              count++;
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int li:nums){
            list.add(li);  
        }
        list.removeAll(Arrays.asList(0));
        for(int i=0;i<count;i++){
            list.add(0);
        }
        return list;
	}
}

	
	
	

