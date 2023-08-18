package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class Q32_SecondLargestDigitInAString {
	
	/**
	 * 1) Get the number using regular expression
	 * 2) then remove the duplicate number 
	 * 3)
	 */
	

	@Test
	public void test1() {
		int secondLargestDigitInAString = secondLargestDigitInAString("dfa12321afd");
		Assert.assertEquals(2, secondLargestDigitInAString);
	}
	@Test
	public void test3() {
		int secondLargestDigitInAString = secondLargestDigitInAString("dfa123214afd"); //1,2,3,4
		Assert.assertEquals(3, secondLargestDigitInAString);
	}
	@Test
	public void test2() {
		int secondLargestDigitInAString = secondLargestDigitInAString("abc1111");
		System.out.println(secondLargestDigitInAString);
		Assert.assertEquals(-1, secondLargestDigitInAString);
	}

	public int secondLargestDigitInAString(String st) {
		String digits = st.replaceAll("[^0-9]", "");
		int[] arr=new int[digits.length()];
		for (int i = 0; i < digits.length(); i++) {
			arr[i]=Character.getNumericValue(digits.charAt(i));
		}
		Set<Integer> set = new HashSet<>(); // 1,2,3,4==> 3
	        for (int i : arr) {
	            set.add(i);
	    }
	    ArrayList<Integer> ls= new ArrayList<>(set);   
	    if(ls.size()<2) 
	    	return -1;
		else
	      return ls.get(ls.size()-2);
	}
	
}
