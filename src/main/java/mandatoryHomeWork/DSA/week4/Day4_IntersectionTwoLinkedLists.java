package mandatoryHomeWork.DSA.week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Day4_IntersectionTwoLinkedLists {
	
	/*  https://leetcode.com/problems/intersection-of-two-linked-lists/ 
	 *  1. Create the hashSet and store each node1 (head1) address 
	 *  2. Iterate with node2 and get the address of the each and 
	 *  	whether address contains in set
	 *  3.  If yes return the head	
	 */
	
	@Test
	public void test() {
		ListNode head1 = new AddLinkedLsit().add(new int[] {4,1,8,4,5});
		ListNode head2 = new AddLinkedLsit().add(new int[] {5,6,1,8,4,5});
		ListNode getIntersectionNode = getIntersectionNode(head1,head2);
		System.out.println(getIntersectionNode);
	}

	public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
		Set<Integer> set=new HashSet<Integer>();
		while(head1!=null) {
			set.add(head1.hashCode());
			head1=head1.next;
		}
		while(head2!=null) {
			int hashCode = head2.hashCode();
			if(set.contains(hashCode)) {
				return head2;
			}
			head2=head2.next;
		}
		
	    return null;
	}
}
