package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q10_CountofMatchesTournament {
	
	
	/**
	 * //*int matches =0;
	//** 1 input as int 
	//** 2 output as int
	
	//** if team is 1 return as 1
	//** if team%2 == 0
	//**  Matches = matches +team/2 ---> 5+1=6
		 team=team/2; ---> 2
	
	//** else part if 
	//*matches = matches+( n-1 )/2 ---> matches= 3
	//* team = ( n-1 )/2 +1 --->  4
	 */
	@Test
	public void test1(){
		int countofMatches = CountofMatches(7);
		Assert.assertEquals(6, 6);
	}
	@Test
	public void test2(){
		int countofMatches = CountofMatches(14);
		Assert.assertEquals(13, 13);
	}
	public int CountofMatches(int team) {
		int matches=0; //o[1]
		if(team==1) {
			return 1;
		}
		while(team>1) {
		if(team%2==0) { 
			matches = matches +team/2;
			team=team/2;
		}
		else {
			matches = matches+( team-1 )/2;
			team = (team-1 )/2+1;
		}
	  }
		System.out.println(matches);
		return matches;
	}

}
