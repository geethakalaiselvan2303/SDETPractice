package mandatoryHomeWork.DSA.week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Test;

public class CyclicLInkedList {
	
	@Test
	public void test() {
		ListNode getIntersectionNode = hasCycle();
		AddLinkedLsit.printList(getIntersectionNode);
	}

	public ListNode hasCycle() {
		
		ListNode head1 = new ListNode(1);//head
		ListNode current = head1;//tail

        // Add nodes from 2 to 7
        for (int i = 2; i <= 7; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        // Use random generator to select insertion point
        Random random = new Random();
        int randomIndex = random.nextInt(6) + 2; // Generates random number between 2 and 7

        // Insert node 8 at the randomly selected index (forming an acyclic list)
        ListNode newNode = new ListNode(8);
        current = head1;
        for (int i = 1; i < randomIndex; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        
		return head1;

	}
	
	

}
