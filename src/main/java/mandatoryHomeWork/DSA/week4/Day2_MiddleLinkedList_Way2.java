package mandatoryHomeWork.DSA.week4;

import org.junit.Test;

public class Day2_MiddleLinkedList_Way2 {
	
	/*  https://leetcode.com/problems/middle-of-the-linked-list/description/
	 *  1. Get the size of the ListNode and to calculate the middle node (size/2+1)
	 *  2. Iterate with ode still the size and move the currentNode=currentNode.next
	 *  3. Create the result ListNode and assign the currentNode
	 *  4. Return the result  	
	 */

	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1,2,3,4,5});
		ListNode middleNode = middleNode(head);
		AddLinkedLsit.printList(middleNode);
	}

	public ListNode middleNode(ListNode head) {
		
		ListNode slow=head,fast=head,currentNode=head;
		while(currentNode!=null) {
			
		}
		return head;
		
	}
}
