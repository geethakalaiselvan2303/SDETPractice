package mandatoryHomeWork.DSA.week6;

import org.junit.Test;

import mandatoryHomeWork.DSA.week6.AddLinkedLsit;
import mandatoryHomeWork.DSA.week6.ListNode;

public class Day1_SortList {

	/*  https://leetcode.com/problems/sort-list/
	 * 
	  * 1. Create the dummy listNode
	 * 2. add the node in the head
	 * 		before adding check for the condition whether dummy node values are lesser than the values which is there in head
	 * 
	 * Time complexity--> O[n^2]
	 * space Complexity-->O[n]
	 *
	 * 
	 */
	
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {4,2,1,3}); // 1 5 2 4 3 
		ListNode sortList = sortList(head);
		AddLinkedLsit.printList(sortList);
	}
	
	 public ListNode sortList(ListNode head) {
		 
		 if (head == null || head.next == null) {
		        return head;
		    }
  		ListNode temp = null,slow=head,fast=head;

     	 while(fast!=null && fast.next!=null) {
     		 temp=slow;
     		 slow=slow.next;
     		 fast=fast.next.next;
		}
     	temp.next=null;
     	
     	ListNode l1=sortLinkedList(slow);
     	ListNode l2=sortLinkedList(fast);
     	
		 
		return head;
	        
	    }

	public ListNode sortLinkedList(ListNode node) {
		ListNode node1=node,node2=node.next.next;
		while(node2!=null)
		return null;
		return node2;
	}
}
