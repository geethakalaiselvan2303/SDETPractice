package MandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class Nearestmultipleof10 {

	/* 1) intialize incre=1,decre=1,int in,de;
	2) use while condition to check while(n%10!=0) and n=n+1 then incre++ store the n value to in 
	3) use while condition to check while(n%10!=0) and n=n-1 then decre++ store the n value to de
	4) if incre and decre are equal then return least value
	5) check for the condition if(decre>incre) the return the in else return de
	*/
	
	@Test
	public void test1() {
		Nearestmultipleof10(23);
	}

	public int Nearestmultipleof10(int n) {
		int result=0;
		int incre=0,decre=0,in=0,de=0;
		int n1=n;
		while(n%10!=0) {
			n=n+1;
			incre++;
			in=n;
		}
		while(n1%10!=0) {
			n1=n1-1;
			decre++;
			de=n1;
		}
		if(decre>incre) {
			System.out.println(n);
			result=n;
		}
		else {
			System.out.println(n1);
			result=n1;
		}
		return result;
			
	}

}
