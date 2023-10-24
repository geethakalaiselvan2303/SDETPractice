package mandatoryHomeWork.DSA.week6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Day2_PartitionLabels {
	
	/*  https://leetcode.com/problems/partition-labels/submissions/
	 *  1. Add the lastIndexOf of each character in map
	 *  2. Initialize start=0,end=0;
	 *  3. Iterate with string get the lastindex value for the corressponding and check for the max value
	 *  	max value is stored in end variable
	 *  	if the index value is equal to the end then 
	 *  	store the (end-start)+1 in result list
	 *  	then assign the end+1 in start
	 *  
	 *  Time complexity---> o[n+m]
	 *  
	 * 
	 */
	
	@Test
	public void test1() {
		partitionLabels("ababcbacadefegdehijhklij");
	}
	 public List<Integer> partitionLabels(String s) {
		List<Integer> result = new ArrayList<>();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			int startIndex=i;
			int endIndex=s.lastIndexOf(s.charAt(startIndex));
			map.put(s.charAt(i), endIndex);
			}
		int start=0,end=0;
		for (int i = 0; i < s.length(); i++) {
			end=Math.max(end, map.get(s.charAt(i)));
		    if(i==end)	{
		    	result.add(end - start + 1);
                start = end + 1;
		    }
		}
		System.out.println(result);
		return result;
	        
	    }
}
