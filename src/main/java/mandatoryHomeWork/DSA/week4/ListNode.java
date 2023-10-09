package mandatoryHomeWork.DSA.week4;

public class ListNode {
	
	/*
	 * https://leetcode.com/problems/reverse-linked-list/description/
	 */
	
	public int val;
	public ListNode next;

	public ListNode(int data) {
		val=data;
	}

	public static void main(String[] args) {
		
		ListNode l1=new ListNode(11);
		ListNode l2=new ListNode(43);
		ListNode l3=new ListNode(28); 
		ListNode l4=new ListNode(18);
		ListNode l5=new ListNode(90);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=null;
		
		ListNode head=l1;
		reverseList(head);
		printList(head);
	
	}

	
	 public static ListNode reverseList(ListNode head) {
		 ListNode previousNode = null,currentNode=head;;
			while(currentNode!=null) {
				ListNode temp=currentNode.next;
	    		currentNode.next=previousNode;
	        	previousNode=currentNode;
	        	currentNode=temp;
	    	}

			return previousNode;
	}

	public static void printList(ListNode head) {
		ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
		
	}