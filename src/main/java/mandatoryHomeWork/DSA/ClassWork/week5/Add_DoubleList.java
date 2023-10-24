package mandatoryHomeWork.DSA.ClassWork.week5;

import org.junit.Test;

import mandatoryHomeWork.DSA.week4.AddLinkedLsit;

public class Add_DoubleList {

	
	@Test
	public void test() {
		DoubleListNode head = new AddDoubleLinkedList().add(new int[] {1,4,5,8,7});
		AddDoubleLinkedList.printList(head);
	}
}
