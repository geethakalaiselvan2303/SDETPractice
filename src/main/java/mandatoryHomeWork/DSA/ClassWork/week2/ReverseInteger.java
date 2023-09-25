package mandatoryHomeWork.DSA.ClassWork.week2;

public class ReverseInteger {

	public static void main(String[] args) {
		int n=1211;
		int result=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(sum==result) {
			System.out.println("palidrome");
		}
		else {
			System.out.println("not palidrome");
		}
	}

}
