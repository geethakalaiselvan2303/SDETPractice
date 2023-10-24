package mandatoryHomeWork.DSA.week5;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import mandatoryHomeWork.DSA.week5.AddLinkedLsit;
import mandatoryHomeWork.DSA.week5.ListNode;

public class AddNodeAtSpecificPosition {
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1,2,3,4,5}); // 1 2  3 4 5  
		ListNode getIntersectionNode = AddNodeAtTail(head,8,2);
		AddLinkedLsit.printList(getIntersectionNode);
	}

	   public ListNode AddNodeAtTail(ListNode head,int data,int pos) {
		   ListNode newNode = new ListNode(data);
		   ListNode currentNode=head;
		   if (pos == 0) {
		        newNode.next = head;
		        return newNode;
		    } 
		   else {
			   for (int i = 1; i < pos; i++) {
				   currentNode=currentNode.next;
			   } 
			   newNode.next=currentNode.next;
			   currentNode.next=newNode;
			   }
		   	return head;
	    }
	}


