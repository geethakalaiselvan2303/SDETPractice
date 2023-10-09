package mandatoryHomeWork.DSA.ClassWork.week4;

public class LinkedListAdd {
	
	public int val;
	public LinkedListAdd next;

	public LinkedListAdd(int data) {
		val=data;
	}

	public static void main(String[] args) {
		
		LinkedListAdd l1=new LinkedListAdd(11);
		LinkedListAdd l2=new LinkedListAdd(43);
		LinkedListAdd l3=new LinkedListAdd(28); //2
		LinkedListAdd l4=new LinkedListAdd(18);
		LinkedListAdd l5=new LinkedListAdd(90);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=null;
		
		LinkedListAdd pointer=l1;
		printList(pointer);

	}

	
	 public static void printList(LinkedListAdd head) {
	        LinkedListAdd current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
		
	}