package MandatoryHomeWork.Foundation;

public class Q17_ClimbingStairs {
	
/**
 * No of step=5;
	From 0th to 1st step==> 1 way
	come to 1th steps==> 1 way
	come to 2th steps==> (1,1) (2) ==>2 way
	come to 3nd steps(3)==>(2,1),(1,2),(1,1,1) ==> 3 way
	come to 4st steps(4)==> (1,1,1,1),(2,2),(2,1,1),(1,2,1),(1,1,2) ==> 5way
	come to 5th steps(5)==>(1,1,1,1,1),(2,1,1,1),(1,2,1,1),(1,1,2,1),(1,1,1,2),(2,2,1),(2,1,2),(1,2,2)==>8
	 
	  To reach the 5 step it flows the fibnocci series==> 1,1,2,3,5,8 
 * 
 */
	
	public static void main(String[] args) {
		int x=1,y=1,temp;
		int n=5;
		for (int j = 0; j < n-1; j++) {
			temp=x; 
			x=x+y;
			y=temp;
		}
		System.out.println("Number ways the :" +x);
	}
}
