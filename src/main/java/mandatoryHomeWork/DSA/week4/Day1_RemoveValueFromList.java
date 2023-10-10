package mandatoryHomeWork.DSA.week4;

import org.junit.Test;

public class Day1_RemoveValueFromList {
	
	/*  https://leetcode.com/problems/remove-linked-list-elements/
	 * 
	 */
	public ListNode removeElements(ListNode head, int val) {
	     while(head!=null && head.val == val){
	         head=head.next;
	     }
	     ListNode previousNode=null,currentNode=head;
	     while(currentNode!=null){
	     if(currentNode.val==val){
	         previousNode.next=currentNode.next;
	     }
	     else{
	         previousNode=currentNode;
	     }
	       currentNode=currentNode.next;

	     }
	     
	     return head;
	   }
	
		@Test
		public void test() {
			ListNode head = new AddLinkedLsit().add(new int[] { 1, 2, 3, 4, 5, 6, 4 });
			AddLinkedLsit.printList(head);
			head = removeElements(head, 4);
			AddLinkedLsit.printList(head);
		}

		 
	}
