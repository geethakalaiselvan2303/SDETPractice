package mandatoryHomeWork.DSA.ClassWork.week2;

public class KandaneAlorithm {

	public static void main(String[] args) {
		
		/* 1. Initialize the max=0 and currentSum as 0
		 * 2. loop 0 to end of the length
		 * 3. if currentSum is less than zero, reset currentSum as 0
		 * 4. If currentSum is greater than or equal to zero , add the current index 
		 *     value to currentSum
		 * 5. Assign maximum with max of maximum and currentSum    
		 * 
		 *   input ---> -2,1,-3,4,-1,2,1,-5,4
		 *   o/p   ---> [4,-1,2,1]
		 * 
		 */
		
		int[] n= {-2,1,-3,4,-1,2,1,-5,4};
		int maximum=0, currentSum=0,left=0;
		int max=Integer.MIN_VALUE;
		while(left<n.length) {
			currentSum=currentSum+n[left];
			if(currentSum<0) {
				currentSum=0;
			}
			else {
				max=Math.max(maximum, currentSum);
			}
			 left++;
	    	  
		}
		System.out.println(max);
	}

}
