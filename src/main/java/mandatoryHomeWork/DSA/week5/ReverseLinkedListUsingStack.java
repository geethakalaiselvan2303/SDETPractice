package mandatoryHomeWork.DSA.week5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

import mandatoryHomeWork.DSA.week5.AddLinkedLsit;
import mandatoryHomeWork.DSA.week5.ListNode;

public class ReverseLinkedListUsingStack {
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {1,2,3,4,5}); // 1 5 2 4 3 
		ListNode getIntersectionNode = AddNodeAtTail(head,8);
		AddLinkedLsit.printList(getIntersectionNode);
	}

	   public ListNode AddNodeAtTail(ListNode head,int data) {
		   ListNode newNode = new ListNode(data); 
		   Stack<Integer> stack=new Stack<Integer>();
		    ListNode currentNode=head;
		   while(currentNode.next!=null) {
		    	int n=currentNode.val;
		    	stack.push(n);
		    	currentNode=currentNode.next;
		   }
		   while(!stack.isEmpty()) {
			   newNode.val = stack.pop();
			   newNode.next=null;
		   }
		  
		   
				
			return head;
	    }
	}


