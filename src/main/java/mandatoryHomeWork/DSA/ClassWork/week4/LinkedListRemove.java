package mandatoryHomeWork.DSA.ClassWork.week4;

public class LinkedListRemove {
	
	public int val;
	public LinkedListRemove next;

	public LinkedListRemove(int data) {
		val=data;
	}

	public static void main(String[] args) {
		
		LinkedListRemove l1=new LinkedListRemove(11);
		LinkedListRemove l2=new LinkedListRemove(43);
		LinkedListRemove l3=new LinkedListRemove(28); //2
		LinkedListRemove l4=new LinkedListRemove(18);
		LinkedListRemove l5=new LinkedListRemove(90);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=null;
		
		LinkedListRemove pointer=l1;
		LinkedListRemove updatedList = remove(l1,2);
		printList(updatedList);

	}

	public static LinkedListRemove remove(LinkedListRemove l1, int index) {
			LinkedListRemove ptr=l1;
			for (int i = 0; i < index-1; i++) {
				ptr=ptr.next; //43
			}
			
			LinkedListRemove nodeToDelete=ptr.next; //18
			
			ptr.next=nodeToDelete.next;
			return l1;
		}
	 public static void printList(LinkedListRemove head) {
	        LinkedListRemove current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
		
	}