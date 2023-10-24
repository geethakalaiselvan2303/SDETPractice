package mandatoryHomeWork.DSA.week5;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import mandatoryHomeWork.DSA.week5.AddLinkedLsit;
import mandatoryHomeWork.DSA.week5.ListNode;

public class AddNodeAtTail {
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1,2,3,4,5}); // 1 5 2 4 3 
		ListNode getIntersectionNode = AddNodeAtTail(head,8);
		AddLinkedLsit.printList(getIntersectionNode);
	}

	   public ListNode AddNodeAtTail(ListNode head,int data) {
		   ListNode newNode = new ListNode(data);
		   ListNode currentNode=head;
		   if(head==null) {
			   head=newNode;
		   }
		   else {
			   while(currentNode.next!=null) {
		    		currentNode=currentNode.next;
		    	}
			   currentNode.next = newNode;
		   }
				
			return head;
	    }
	}


