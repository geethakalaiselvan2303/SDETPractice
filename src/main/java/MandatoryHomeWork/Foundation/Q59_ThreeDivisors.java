package MandatoryHomeWork.Foundation;

import org.junit.Test;

public class Q59_ThreeDivisors {

	@Test
	public void test1() {
		divisorcountThree(10);
	}

	public boolean divisorcountThree(int n) {
		int count=0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				count++;
				if(count==3) {
					break;
				}
			}
		}
		System.out.println(count);
		return count==3;
	}
}
