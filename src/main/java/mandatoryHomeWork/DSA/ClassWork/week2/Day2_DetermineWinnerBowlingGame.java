package mandatoryHomeWork.DSA.ClassWork.week2;

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
	 */
	
	@Test
	public void test1() {
		int winner = isWinner(new int[] {4,10,7,9},new int[] {6,5,2,3});
		System.out.println(winner);
		Assert.assertEquals(1, winner);
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
	 int sum1=0,sum2=0,prevIndex1=0,prevIndex2=0;
	 for (int i = 0; i < player1.length; i++) {
		if(player1[i]==10) {
			sum1=sum1+player1[i];
			prevIndex1=i;
			int end=prevIndex1+2;
			prevIndex1++;
			while(prevIndex1<end) {  //1<3
				i++;prevIndex1++;
				sum1=sum1+2*player1[i];
			}
		}
		else {
			sum1=sum1+player1[i];
		}
	}
	 
	 for (int i = 0; i < player2.length; i++) {
			if(player2[i]==10) {
				sum2=sum2+player2[i];
				prevIndex2=i;
				int end=prevIndex2+2;
				prevIndex2++;
				while(prevIndex2<end) {  //1<3
					i++;prevIndex2++;
					sum2=sum2+2*player2[i];
				}
			}
			else {
				sum2=sum2+player2[i];
			}
		}
	
	 if(sum1==sum2) {
		 return 0;
	 }
	 else if(sum1>sum2) {
		 return 1;
	 }
	 else
		 return 2;
        
    }

}
