package mandatoryHomeWork.DSA.week5;

public class AddLinkedLsit {
	
	ListNode head , tail;
    public static int size = 0 ;

       public void add(int value){
        if(head == null)  
            head = tail = new ListNode(value);
        else{
            tail.next = new ListNode(value); 
            tail = tail.next;
        }
        size++;
    }

    public ListNode add(int[] value){
        for(int each : value) add(each);
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
    
    public class LinkedList {
        private ListNode head;

        public LinkedList() {
            this.head = null;
        }
    }

}
