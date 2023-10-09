package mandatoryHomeWork.DSA.ClassWork.week4;

import org.junit.Test;

public class ListNode1 {
    ListNode next;
    int val;

    ListNode1(int value) {
        this.val = value;
        next = null;
    }

    ListNode1(int value, ListNode next) {
        this.val = value;
        this.next = next;
    }
    
    
    ListNode head , tail;
    private int size = 0 ;
    
    public void add(int value){
        if(head == null)  
            head = tail = new ListNode(value);
        else{
            tail.next = new ListNode(value);  // 11 -> 43
            tail = tail.next;
        }
        size++;
    }
    
    public ListNode reverseList(ListNode head) {
    	ListNode previousNode = null;
    	while(head!=null) {
    		ListNode temp=head.next;
        	head.next=previousNode;
        	previousNode=head;
        	head=temp;
//        	printList(head);
    	}
     	
		return head;
    	
    }

//	private void printList(ListNode head) {
//		ListNode current = head;
//	        while (current != null) {
//	            System.out.print(current.val + " ");
//	            current = current.next;
//	        }
//	        System.out.println();		
//	}
//	
//	
//	public void testReverseList() {
//        ListNode list = new ListNode();
//        for(int each : new int[]{11, 43, 27, 11, 90}) {
//            add(each);
//        }
//        System.out.println("Original List:");
//        printList(list);
//
//        ListNode reversedList = reverseList(list);
//        System.out.println("Reversed List:");
//        printList(reversedList);
//    }
//    
//    public static void main(String[] args) {
//        ListNode listNode = new ListNode();
//        listNode.testReverseList();
//    }
}


