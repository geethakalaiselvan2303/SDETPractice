package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class Q67_SummaryRanges {
	
	/*  https://leetcode.com/problems/summary-ranges/
	 * nums = [0,2,3,4,6,8,9] ["0","2->4","6","8->9"]
		1. Declare the arraylist
		1. Iterate with nums 
		2. Store the first index value in left 
		3. Check for the condition  nums[i]+1==nums[i+1]
		4. Store the next index value in right 
		5. check for the condition left!=right 
		6. add the vales in the arraylist 
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(SummaryRanges(new int[] {0,1,2,4,5,7}));
	}
	@Test
	public void test2() {
		System.out.println(SummaryRanges(new int[] {1}));
	}

	@Test
	public void test3() {
		System.out.println(SummaryRanges(new int[] {}));
	}
	public List<String> SummaryRanges(int[] nums) {
		List<String> list=new ArrayList<>();

		if(nums.length == 1) {
	         list.add(nums[0] + "");
	         return list;
	     }  
        for(int i=0;i<nums.length;i++){
            int left=nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]) {
                i++;}
            int right=nums[i];
            
            if(left!=right){
            	list.add(""+left+"->"+right);
            }
            else{
            	list.add(""+left);
            }
        }

        return list;
		
	}

}
