package mandatoryHomeWork.DSA.ClassWork.week4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class NumberStudentsUnableEatLunch {
	
	@Test
	public void test() {
		System.out.println(countStudents(new int[] {1,1,0,0},new int[] {0,1,0,1}));
	}

	public int countStudents(int[] students, int[] sandwiches) {
		Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int student : students) {
            stack.push(student);
        }
		for (Integer q : sandwiches) {
			queue.add(q);
		}
		
		int count=0;
		while(!queue.isEmpty()) {
			if (stack.isEmpty()) {
                break;
            }
			  int studentPreference = stack.pop();
	            int sandwichPreference = queue.poll();
	            if (studentPreference == sandwichPreference) {
	                count++;
		}
	            else {
	                // The student's preference does not match the available sandwich, put the preferences back
	                stack.push(studentPreference);
	                queue.offer(sandwichPreference);
	            }
	        }
		return students.length-count;
		
		
	}

}
