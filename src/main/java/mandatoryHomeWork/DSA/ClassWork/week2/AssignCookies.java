package mandatoryHomeWork.DSA.ClassWork.week2;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		
		/* https://leetcode.com/problems/assign-cookies/description/
		 *  1. Declare left=0,right=0
		 *  2. Sort both greed factor and cookies
		 *  2. check for the condition whether greddy factor is greater than equal to cookies
		 *  	if yes increment left and right
		 *  	increment count++
		 *  3. else
		 *  	and check for the condition whether greddy factor is greater than equal to cookies 
		 *  
		 *  4. 
		 * 
		 */
		
		int[] children= {1,2,3};
		int[] cookies= {1,1};
		Arrays.sort(children);
		Arrays.sort(cookies);
		int right=0,left=0,count=0;
		while(left<children.length && right<cookies.length) {
			if(cookies[right] >= children[left]) {
				right++;
				left++;
				count++;
			}
			else {
				right++;
				}
			}
		
		System.out.println(count);
		}

}
