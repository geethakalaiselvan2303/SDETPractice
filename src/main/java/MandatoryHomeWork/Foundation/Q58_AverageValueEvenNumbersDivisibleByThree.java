package MandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q58_AverageValueEvenNumbersDivisibleByThree {
	// https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
	
	/* 1) declare the variable count=0
	 * 2) Iterate through loop num[]
	 * 3) check for the condition (num%2==0 && num%3==0) 
	 * 4) the add the values which is diviable by 2 and 3 if yes then count++
	 * 5) check for if condition whether count!=0 then n=result/count;
	 * 6) if yes print the n value
	 * 7) else print it as count=0;
	 */
	
	@Test
	public void test1() {
		int averageValueEvenNumbersDivisibleByThree = averageValueEvenNumbersDivisibleByThree(new int[] {1,3,6,10,12,15});
		Assert.assertEquals(9, averageValueEvenNumbersDivisibleByThree);
	}
	@Test
	public void test2() {
		int averageValueEvenNumbersDivisibleByThree = averageValueEvenNumbersDivisibleByThree(new int[] {1,2,4,7,10});
		Assert.assertEquals(0, averageValueEvenNumbersDivisibleByThree);
	}
	

	public int averageValueEvenNumbersDivisibleByThree(int[] num) {
		int result=0,count = 0,n=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0 && num[i]%3==0){
                result=result+num[i];
                count++;
            }
         }
        if(count!=0) {
        	n=result/count;
            System.out.println(n);
        	return n;
        }
        else {
		return 0;
		}
	}

}
