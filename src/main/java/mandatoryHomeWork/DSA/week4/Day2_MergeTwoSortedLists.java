package mandatoryHomeWork.DSA.week4;

import org.junit.Test;

public class Day2_MergeTwoSortedLists {
	
	/*  https://leetcode.com/problems/merge-two-sorted-lists/
	 * 1. Create empty ListNode to store the result 
	 * 1. Assign the head1 to currentNode1 and head2 to currentNode1
	 * 2. Check for the condition currentNode1 and currentNode2 != null
	 * 3. Use two pointer one at head1 and another at head2
	 * 4. Check for the condition currentNode1.value<=currentNode1.value
	 * 		if yes add the currentNode1 in the empty listNode and move the to currentNode1.next
	 * 		else add the currentNode2 in the empty listNode and move the to currentNode2.next
	 * 		then move the pointer
	 * 5. Then check for the condition currentNode1!=null to check Attach the remaining nodes from either list
	 * 		add the remaining nodes
	 * 6. Return the empty nodes. 
	 * 
	 */
	public ListNode mergeTwoList(ListNode head1, ListNode head2) {
		    ListNode empty = new ListNode(0);
		    ListNode newNode = empty;

		    ListNode currentNode1 = head1;
		    ListNode currentNode2 = head2;

		    while (currentNode1 != null && currentNode2 != null) {
		        if (currentNode1.val <= currentNode2.val) {
		        	newNode.next = currentNode1;
		            currentNode1 = currentNode1.next;
		        } else {
		        	newNode.next = currentNode2;
		            currentNode2 = currentNode2.next;
		        }
		        newNode = newNode.next;
		    }

		    // Attach the remaining nodes from either list
		    if (currentNode1 != null) {
		    	newNode.next = currentNode1;
		    } else {
		    	newNode.next = currentNode2;
		    }

		    return empty.next;
		    }
	   	
		@Test
		public void test() {
			ListNode head1 = new AddLinkedLsit().add(new int[] {1, 2, 4});
			ListNode head2 = new AddLinkedLsit().add(new int[] {1, 3, 4});
			ListNode mergeTwoList = mergeTwoList(head1,head2);
			AddLinkedLsit.printList(mergeTwoList);
		}

		 
	}
