package mandatoryHomeWork.DSA.week4;

import org.junit.Test;

public class Day5_Roatatelist {
	
	/* https://leetcode.com/problems/rotate-list/
	 * 
	 */
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1,2,3,4,5});
		ListNode getIntersectionNode = rotateRight(head,2);
		AddLinkedLsit.printList(getIntersectionNode);
	}

	public ListNode rotateRight(ListNode head, int k) {
		
		if(head==null) return null;
        //init
        ListNode tail =head;
        int size  = 1, counter = 0;
        //finding the size of the list and also finding the tail
        while(tail.next != null) {
            tail = tail.next;
            size++;
        }
        //find the optimum rotation required
        k %= size;

        //if no rotation required retuning head
        if(k==0) return head;

        ListNode temp =head;

        //iterating till the end-1 of list1
        while(counter < size-k-1){
            temp = temp.next;
            counter++;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        tail.next = head;

        return newHead;
			
		
	}

}
