package mandatoryHomeWork.DSA.week4;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LinkedListCycle {
	
	/* https://leetcode.com/problems/linked-list-cycle/description/
	 * 
	 */
	
	@Test
	public void test() {
		ListNode head = new AddLinkedLsit().add(new int[] {3,2,0,-4});
		boolean getIntersectionNode = hasCycle(head);
		System.out.println(getIntersectionNode);
	}

	public boolean hasCycle(ListNode head) {
		  boolean flag=false;
	        ListNode temp=head;
	        Set<Integer> set=new HashSet<Integer>();        
	        while(temp!=null){
	            if(!set.contains(temp)){
	            set.add(temp.hashCode());
	            temp=temp.next;
	            }
	            else{
	                 flag=true;
	                 break;
	            }
	        }
	        return flag;
	}

}
