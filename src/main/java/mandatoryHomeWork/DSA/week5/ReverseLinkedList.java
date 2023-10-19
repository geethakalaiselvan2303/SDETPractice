package mandatoryHomeWork.DSA.week5;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import mandatoryHomeWork.DSA.week5.AddLinkedLsit;
import mandatoryHomeWork.DSA.week5.ListNode;

public class ReverseLinkedList {
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1,2,3,4,5}); // 1 5 2 4 3 
		ListNode getIntersectionNode = reverseList(head);
		AddLinkedLsit.printList(getIntersectionNode);
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


