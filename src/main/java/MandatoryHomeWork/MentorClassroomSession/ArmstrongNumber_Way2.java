package MandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class ArmstrongNumber_Way2 {
	@Test
	public void test1(){
		arm(153);
	}

	public boolean arm(int n){
		int actual=n;
		int rem=0,sum=0;
		while(n>0){
			rem=n%10;
			sum=sum+str(rem);
			n=n/10;
		}
		System.out.println(sum);
		if(actual==sum) {
			return true;
		}
		else {
		return false;
		}
		}
	
		public int str(int rem) {
			int res=rem*rem*rem;
			return res;
	}

		
		
}
