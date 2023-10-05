package mandatoryHomeWork.DSA.week3;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class Day3_SumOfUniqueElements {
	
	/* https://leetcode.com/problems/sum-of-unique-elements/
	 * 1. Add the values in the map
	 * 2. Iterate with map and if the value is 1
	 * 		then add the value 
	 * 3. Return the value 
	 * 
	 * Time Complexity---> O[N]
	 * Space Complexity---> O[N]
	 */
	
	@Test
	public void test1() {
		int sumOfUnique = sumOfUnique(new int[] {1,2,3,2});
		Assert.assertEquals(sumOfUnique, 4);
	}

	public int sumOfUnique(int[] nums) {
		int result=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n, map.getOrDefault(n,0)+1);
            }
            else{
                map.put(n,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                result=result+entry.getKey();
            }
        }
        return result;

}
}