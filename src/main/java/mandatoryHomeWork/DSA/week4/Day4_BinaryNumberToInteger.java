package mandatoryHomeWork.DSA.week4;

import org.junit.Test;

public class Day4_BinaryNumberToInteger {
	
	/*  https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
	 * 
	 */
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1, 0, 1});
		int decimal = getDecimalValue(head);
		System.out.println(decimal);
	}

	public int getDecimalValue(ListNode head) {
		 String empty="";
	        while(head!=null){
	            int value=head.val;
	            empty=empty+""+value;
	            head=head.next;
	        }
	        int decimal = Integer.parseInt(empty, 2);
		
		return decimal;
	}

}
