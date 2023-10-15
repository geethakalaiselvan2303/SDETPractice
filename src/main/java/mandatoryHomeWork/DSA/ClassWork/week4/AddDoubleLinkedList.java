package mandatoryHomeWork.DSA.ClassWork.week4;

import mandatoryHomeWork.DSA.ClassWork.week4.DoubleListNode;
import mandatoryHomeWork.DSA.week4.ListNode;

public class AddDoubleLinkedList {
	
	public DoubleListNode head;
    public DoubleListNode tail;
    public static int size = 0;


       public void add(int value){
    	DoubleListNode newNode = new DoubleListNode(value);   
        if(head == null)  {
            head = tail =newNode;
       }
        else{
        	newNode.prev = tail;
			tail.next = newNode;
			tail=tail.next;
         }
        size++;
    }
       
       public DoubleListNode add(int[] value){
           for(int each : value) add(each);
           return head;
       }
       
       public static void printList(DoubleListNode head) {
    	   DoubleListNode current = head;
   	        while (current != null) {
   	            System.out.print(current.val + " ");
   	            current = current.next;
   	        }
   	          
   	     }

       
       public class DoubleLinkedList {
           private DoubleListNode head;

           public DoubleLinkedList() {
               this.head = null;
           }
       }
       
      
}
