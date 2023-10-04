package mandatoryHomeWork.DSA.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class Day2_JewelsAndStones {
	
	/* https://leetcode.com/problems/jewels-and-stones/
	 * 1. initialize the count variable as zero
	 * 2. Add the stones in the map
	 * 3. Iterate with jewels and check for the condition whether jewels are present in stone 
	 * 4. if yes add the value with the count
	 * 
	 * Time Complexity----> o[M*N]
	 * Space complexity---> O[N]
	 * 
	 */
	
	@Test
	public void test1() {
		int jewelsAndStones = jewelsAndStones("ebd","bbb");
		Assert.assertEquals(jewelsAndStones, 3);
	}

	public int jewelsAndStones(String jewels, String stones) {
		int count = 0;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (char c1 : stones.toCharArray()) { 
			map.put(c1, map.getOrDefault(c1, 0)+1);
		}
		
		for (char c:jewels.toCharArray()) {
			for(Map.Entry<Character,Integer> entry: map.entrySet()){
	        	if(entry.getKey().equals(c)){
	        		count=count+entry.getValue();
	            
	            }}
		}
		
	      

	
	return count;
			
		
		
	}

}
