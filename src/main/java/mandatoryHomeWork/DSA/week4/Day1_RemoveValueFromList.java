package mandatoryHomeWork.DSA.week4;

import mandatoryHomeWork.DSA.ClassWork.week4.ListNode;

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
	
	public static void printList(ListNode head) {
		ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
		
	
	 public static void main(String[] args) {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(6);
	        head.next.next.next = new ListNode(3);
	        head.next.next.next.next = new ListNode(4);
	        head.next.next.next.next.next = new ListNode(6);

	        Day1_RemoveValueFromList operations = new Day1_RemoveValueFromList();
	        int valToRemove = 6;
	        ListNode modifiedHead = operations.removeElements(head, valToRemove);
	        operations.printList(modifiedHead);
	    }
		
	
}
