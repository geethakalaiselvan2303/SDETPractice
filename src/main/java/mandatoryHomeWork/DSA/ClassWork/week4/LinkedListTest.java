package mandatoryHomeWork.DSA.ClassWork.week4;

import org.junit.Test;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

import static org.junit.Assert.*;

	public class LinkedListTest {
		

	    @Test
	    public void test() {
	        int[] inputArray = {11,43,28,11,90};
	        LinkedList list = new LinkedList();

	        for (int num : inputArray) {
	            list.add(num);
	        }
	        list.remove(43);

	    }

	    public class Node {
	        int data;
	        Node next;

	        public Node(int key) {
	            this.data = key;
	            this.next = null;
	        }
	    }
	   

	    public class LinkedList {
	    	 Node head;
	         Node tail;
	         int size=0;
	       public void add(int data) {
	            Node node = new Node(data);
	            if (head == null) {
	                head = node;
	                tail = node;
	            } else {
	                tail.next = node;
	                tail =  tail.next;
	            }
	            size++;
	        }
	       
	       public void remove(int value) {
	    	   if(value==0) head=head.next;
	    	   else {
//	    	   int currentNode=head;
//	    	   Node prevNode=null;
//				 if(data==0) {
//					 
//				 }
				
			}
	       }}}
	

		
		
		


	    
