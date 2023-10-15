package mandatoryHomeWork.DSA.ClassWork.week4;

import org.junit.Test;

public class RemoveDoubleLinkedList {
	
	@Test
	public void test() {
		DoubleListNode head = new AddDoubleLinkedList().add(new int[] {1,4,5,8,7});
		DoubleListNode headRemove=removeHeadNode(head);
		AddDoubleLinkedList.printList(headRemove);
//		DoubleListNode LastRemove=removeLastNode(head);
//		AddDoubleLinkedList.printList(LastRemove);
	}

	public DoubleListNode removeLastNode(DoubleListNode head) {
		DoubleListNode temp=head;
		while(temp!=null) {
			temp=temp.next;
		}
		if(temp==null) {
			temp=temp.prev;
			temp.next=null;
		}
		return head;
		
	}

	public DoubleListNode removeHeadNode(DoubleListNode head) {
		if(head.prev==null) {
			head=head.next;
			head.prev=null;
		}
		return head;
	}
}
