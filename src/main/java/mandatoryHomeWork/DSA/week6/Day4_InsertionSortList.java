package mandatoryHomeWork.DSA.week6;

import org.junit.Test;

public class Day4_InsertionSortList {
	
	/*
	 * https://leetcode.com/problems/insertion-sort-list/submissions/
	 * 1. Create the dummy listNode
	 * 2. add the node in the head
	 * 		before adding check for the condition whether dummy node values are lesser than the values which is there in head
	 * 
	 * Time complexity--> O[n^2]
	 * space Complexity-->O[n]
	 */

	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {4,5,1,8}); // 1 5 2 4 3 
		ListNode insertionSortList = insertionSortList(head);
		AddLinkedLsit.printList(insertionSortList);
	}

	public ListNode insertionSortList(ListNode head) {
		 ListNode dummy=new ListNode(0);
	        while(head!=null){
	            ListNode currentNode=head.next;
	            ListNode temp=dummy;
	            while(temp.next!=null && temp.next.val<head.val){
	                temp=temp.next;
	            }
	            head.next=temp.next;
	            temp.next=head;
	            head=currentNode;
	        }
	        return dummy.next;
	}
}
