package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FIzzbuzz {
	
	/**
	 *  1) input-> int
	 *  2) output -> string array
	 *  3) index start from 1
	 *  4) if i is divisible by 3 and 5 the print FizzBuzz
	 *  5) if i is divisible by 3 then print Fizz
	 *  6) if i is divisible 5 then print Buzz
	 *  7) if none of the above conditions are true then print the index value
	 */
	
	
		@Test
		public void test1(){
			FIzzbuzz(5);
		}
		@Test
		public void test2(){
			FIzzbuzz(3);
		}

		public List<String> FIzzbuzz(int n) {
		List<String> list=new ArrayList<String>();
			for (int i = 1; i <= n; i++) {
			if (n % 3 == 0 && n % 5 == 0) {
				list.add("FizzBuzz");
			} else if (n % 3 == 0) {
				list.add("Fizz");
			} else if (n % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(Integer.toString(i));
			} 
		}
			return list;
		}
		
	}
	
