package MandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Q51_SeleDividingNumber {
	
	/**
	 * 1) Create the list to add the self diving number
	 * 2) iterate with each number using for loop
	 * 3) check for the condition if(digit.contains(0)) then ignore 
	 * 4) check for the condition if(digit<10 && i%i==0) the list.add(digit) 
	 * 5) if this more than a single digit the use the digit%10=remainder 
	 * 6) Divide with remainder if it's zero then add the number in the list
	 */
	
	@Test
	public void test1() {
		List<Integer> selfDividingNumbers = selfDividingNumbers(1,22);
		Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22), selfDividingNumbers);
	}
	@Test
	public void test2() {
		List<Integer> selfDividingNumbers = selfDividingNumbers(47,85);
		Assert.assertEquals(Arrays.asList(48,55,66,77), selfDividingNumbers);
	}
	
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=left;i<=right;i++) {
			if(selfDivide(i)) {
				list.add(i);
			}
			}
		System.out.println(list);
			return list;
	}

	 public boolean selfDivide(int left) {
	        int x = left;
	        while (x > 0) {
	            int rem = x % 10;
	            x =x/10;
	            if (rem == 0 || (left % rem) > 0) return false;
	        }
	        return true;
	}

}
