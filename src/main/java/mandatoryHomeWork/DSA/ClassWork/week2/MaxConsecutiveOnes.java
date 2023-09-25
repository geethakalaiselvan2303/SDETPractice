package mandatoryHomeWork.DSA.ClassWork.week2;

public class MaxConsecutiveOnes {
	
	/* https://leetcode.com/problems/max-consecutive-ones/description/
	 * 
	 */

	public static void main(String[] args) {
      int[] n= {1,0,1,1,0,1};
      int right=0,left=0,max=Integer.MIN_VALUE;
      while(right<n.length) {
    	  if(n[right]==0) {
    		 max=Math.max(max, right-left); 
    		  left=right+1;
    	  }
    	  right++;
    	  max=Math.max(max, right-left); 
    	  
      }
	}

}
