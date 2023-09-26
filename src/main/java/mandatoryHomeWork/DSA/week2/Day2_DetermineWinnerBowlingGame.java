package mandatoryHomeWork.DSA.week2;

import org.junit.Test;
import org.testng.Assert;

public class Day2_DetermineWinnerBowlingGame {
	
	/*  https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/
	 *  1. initialize the sum variable
	 *  2. Iterate with player one 
	 *  	 check for the condition whether the pins is 10
	 *  	 if its 10 then take the store the index value
	 *  	 		iterate with loop still it reaches the index value+2
	 *  			add the index values*2 +sum vaues
	 *  	else
	 *  		add the index value still its reached the length
	 *  
	 *    Time complexity--> o[n]
	 *    Space Complexity-->o[1]
	 */
	
	@Test
	public void test1() {
		int winner = isWinner(new int[] {7,10,2,6,8,5,4,6,10,9,1,4,3,10,0,9,6,1,0},new int[] {2,1,9,4,5,0,6,5,6,10,10,4,8,8,6,9,2,9,5});
		System.out.println(winner);
		Assert.assertEquals(2, winner);
	}
	
	@Test
	public void test2() {
		int winner = isWinner(new int[] {3,5,7,6},new int[] {8,10,10,2});
		System.out.println(winner);
		Assert.assertEquals(2, winner);
	}
	
	
	@Test
	public void test3() {
		int winner = isWinner(new int[] {2,3},new int[] {4,1});
		System.out.println(winner);
		Assert.assertEquals(0, winner);
	}
	
	
public int isWinner(int[] player1, int[] player2) {
	 int sum1=findSum(player1);
	 int sum2=findSum(player2);
	 int result=0;
	 
	 
	 if(sum1>sum2) {
		 result=1;
	 }
	 else if(sum1<sum2) { 
		 result=2;
	 }
	 else {
		 result=0;}
	 return result;
}
	 
	public int findSum(int[] player) { 
	int left=0,right=0,count=0;
	while(right<player.length) { //o[n]
		if(player[right]==10) {
			left=right; 
			count=count+player[right];
			right++;
			while(right<player.length && right-left<=2) {  
				if(player[right]!=10) {
				count=count+2*player[right];
				right++;
				}
				else {
					left=right; 
					count=count+2*player[right++];
				}
		}
		}
		else {
			count=count+player[right];
			right++;
		
		}
	}
	return count;
	
	
}

}