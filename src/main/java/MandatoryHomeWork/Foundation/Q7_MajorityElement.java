package MandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class Q7_MajorityElement {
	
	@Test
	public void text1() {
		Assert.assertEquals(1, majorityNumber(new int[] {2,1,1,1,1,2,2}));
	}
	@Test
	public void text2() {
		Assert.assertEquals(2, majorityNumber(new int[] {2,2,2,1,1,1,1,2,2}));
	}
	public int majorityNumber(int[] arr) {
		int max=0;
		 Map<Integer,Integer> map=new HashMap<>();
		 for (int i:arr) {
		 if(map.containsKey(i)) {
			 int s=map.get(i)+1;
			 map.put(i, s);
		 }
		 else
		 {
			 map.put(i, 1);
		 }
		 }
		 int num=arr.length;
		 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			 if(entry.getValue()>num/2)	{
				max=entry.getKey();
			}
			}
		 System.out.println(max);
		 return max;
}
	}

