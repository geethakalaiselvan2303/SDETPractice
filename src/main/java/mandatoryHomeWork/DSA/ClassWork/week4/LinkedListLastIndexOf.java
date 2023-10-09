package mandatoryHomeWork.DSA.ClassWork.week4;

public class LinkedListLastIndexOf {
	public int size=0;
	public int val;
	public LinkedListLastIndexOf next;

	public LinkedListLastIndexOf(int data) {
		val=data;
		size++;
	}

	public static void main(String[] args) {
		
		LinkedListLastIndexOf l1=new LinkedListLastIndexOf(1);
		LinkedListLastIndexOf l2=new LinkedListLastIndexOf(2);
		LinkedListLastIndexOf l3=new LinkedListLastIndexOf(3); //2
		LinkedListLastIndexOf l4=new LinkedListLastIndexOf(2);
		LinkedListLastIndexOf l5=new LinkedListLastIndexOf(7);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=null;
		
		LinkedListLastIndexOf pointer=l1;
		printList(pointer);
//		indexOfLast(2);

	}

	
//	 public static void indexOfLast(Node ) {
		// TODO Auto-generated method stub
//}?

	public static void printList(LinkedListLastIndexOf head) {
	        LinkedListLastIndexOf current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
		
	}