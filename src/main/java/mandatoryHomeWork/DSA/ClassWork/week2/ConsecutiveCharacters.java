package mandatoryHomeWork.DSA.ClassWork.week2;

public class ConsecutiveCharacters {

	public static void main(String[] args) {
		
		/* https://leetcode.com/problems/consecutive-characters/description/
		 *  1. initialize the right as 1 and left as 0, count as 0 and max=0
		 *  2. Iterate with each character check for the condition if left and right are same character
		 *  3. if both the character not equal then increment right and left
		 *  	if equal the increment the only the right
		 *  	then count=right-left+1
		 *  4. check with max value whthther max is greater the count(count>0)
		 *  	if yes max=count 2>4
		 *  
		 *  
		 */
		
//		String s="abbcccddddeeeeedcba";
		String s = "ccbccbb";
		int count = 0;
        int max = 0;
        int left = 0;
        int right = 0;
           
        while(right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                right++;
            }
            else{
                count = right - left;
                if(count > max){
                    max = count;
                }
                count = 0;
                left = right;
            }
        }
        count = right - left;
        if(count > max){
            max = count;
        }
		System.out.println(max);
	}

}
