package mandatoryHomeWork.DSA.ClassWork.week6;

import org.junit.Test;

public class DivideAndConquer {
	
	@Test
	public void test1() {
		DivideConquer(new int[] {1,2,3,4,5,6,7,8,9});
	}

	public int DivideConquer(int[] n) {
		int target=6;
		int left=0,right=n.length-1;
		int mid=n.length/2;
		
		while(left<=right) {
			
			if(n[mid]==target) {
				return mid;
			}
			if(n[mid]<target) {
				left=mid+1;
			}
			else {
				left=mid-1;
			}
		}
	
		
		return -1;
		
		

	}

}
