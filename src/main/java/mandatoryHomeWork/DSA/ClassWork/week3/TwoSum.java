package mandatoryHomeWork.DSA.ClassWork.week3;

public class TwoSum {
	
	/*  https://leetcode.com/problems/two-sum/description/
	 *  1. Declare the variable left=0 and right=1
	 *  2. Keep the left static position until the right reaches the end of the array
	 *  3. Once the right reaches the pointer end of the array the increment the left 
	 *  4. keep iterating until the left reaches the end of the array
	 *  5. each time check for the condition left+right==target
	 *  6. if yes return the same
	 * 
	 */
	
	public static void main(String[] args) {
		int n[]= {11,15,2,7};
		int target=9;
		int s=0,f=0;
		int left=0,right=1;
		while(right<n.length) {
			if(n[left]+n[right]==target) {
			   s=left;
			   f=right;
			   break;
			}
			if(right==n.length-1) {
				left++;
				right=left+1;
			}
			else {
				right++;
			}
		}
		System.out.println(s+"   "+f);
	}
			

}
