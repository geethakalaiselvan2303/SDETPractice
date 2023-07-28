package MandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class Q12_FindSingleElement {
	
	@Test
	public void test1() {
		int findElement = findElement(new int[] {2,2,2,1,7,1});
		Assert.assertEquals(7,findElement);
	}
	

	@Test
	public void test2() {
		int findElement = findElement(new int[] {2,2,2,1,9,-1});
		Assert.assertEquals(9,findElement);
	}

	public int findElement(int[] arr) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i : arr) {
			if(map.containsKey(i)) {
				int n=map.get(i)+1;
				map.put(i, n);
			}
			else
				map.put(i, 1);
		
		}
		int value=0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			List<Integer> list=new ArrayList<>(map.keySet());
			if(entry.getValue().equals(1)){
				value= entry.getKey();
		}
			}
		System.out.println(value);
		return value;
		
		}

}
