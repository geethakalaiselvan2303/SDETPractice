package mandatoryHomeWork.DSA.week4;

import org.junit.Test;

public class Day3_RemoveDuplicatesSortedList {
	
	/* https://leetcode.com/problems/remove-duplicates-from-sorted-list
	 * 1. Iterate with nodes 
	 * 2. check for the condition currentNode and currentNode.next both have the same value
	 * 		if yes then currentNode.next=currentNode.next.next;
	 *      if not move the currentNode to  
	 * 3. Return the head
	 */
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1,2,4,4,5});
		ListNode mergeTwoList = deleteDuplicates(head);
		AddLinkedLsit.printList(mergeTwoList);
	}

	private ListNode deleteDuplicates(ListNode head) {
		ListNode currentNode=head;
		while(currentNode!=null && currentNode.next!= null) {
			if(currentNode.val==currentNode.next.val) {
			currentNode.next=currentNode.next.next;
			}
			else {
			currentNode=currentNode.next;
			}
			
		}
		return head;
	}

}
