package mandatoryHomeWork.DSA.week5;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import mandatoryHomeWork.DSA.week5.AddLinkedLsit;
import mandatoryHomeWork.DSA.week5.ListNode;

public class Day3_ReorderList {
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1,2,3,4,5}); // 1 5 2 4 3 
		ListNode getIntersectionNode = reorderList(head);
		AddLinkedLsit.printList(getIntersectionNode);
	}

	public ListNode reorderList(ListNode head) {
		 ListNode mid = midddleNode(head);//3
	        ListNode midNext = mid.next;//4
	        mid.next = null;
	        ListNode p2 = reverseList(midNext);
	        ListNode p1 = head;
	        ListNode temp;
	        while(p1!=null && p2!=null){
	            temp = p1.next;
	            p1.next = p2;
	            p1 = p2;
	            p2 = temp;
	    }
			return head;
	    }

	    public ListNode midddleNode(ListNode head){
	        ListNode slow = head;
	        ListNode fast = head;
	        while(fast!=null && fast.next!=null){
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        return slow;
	    }

	    public ListNode reverseList(ListNode head) {
	         ListNode previousNode = null;
				ListNode currentNode=head;
		    	while(currentNode!=null) {
		    		ListNode temp=currentNode.next;
		    		currentNode.next=previousNode;
		        	previousNode=currentNode;
		        	currentNode=temp;
		    	}

				return previousNode;
	    }
	}


