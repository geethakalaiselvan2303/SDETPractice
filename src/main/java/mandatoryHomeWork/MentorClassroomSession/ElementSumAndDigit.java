package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class ElementSumAndDigit {
	
	/*  1. Iterate with arr then add the values & store it in ElementSum
		2. Iterate with arr then check for the condition <10
		3. if yes add the values & store it in productSum
		4. else convert the number in to string and use charAt(will get ascii value)-'0'
		5. convert the ascii value then add it to the productSum
		6. return the ElementSum-productSum
	 * 
	 */
	@Test
	public void test1() {
		System.out.println(ElementSumAndDigit(new int[] {1,15,6,3}));
	}
	
	@Test
	public void test2() {
		System.out.println(ElementSumAndDigit(new int[] {1,2,3,4}));
	}
	public int ElementSumAndDigit(int[] arr) {
		int ElementSum=0,digitSum=0,difffernce=0;
		for (int i=0;i<arr.length;i++){
			ElementSum=ElementSum+arr[i];
			}
			for (int i=0;i<arr.length;i++){
			if(arr[i]<10){
			digitSum=digitSum+arr[i];
			}
			else{
			String s=Integer.toString(arr[i]);
			for(int j=0;j<s.length();j++) {
			char ch = s.charAt(j);
			int intValue = (int) ch-'0';
			digitSum=digitSum+intValue;
			}
			}
			}
			return ElementSum-digitSum;
			}

	}


