package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

import org.junit.Test;

public class RotateElement {
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(RotateArrayElement(new int[] {1,2,3,4,5},4)));
	}

	public int[] RotateArrayElement(int[] input, int nofoRoatation ) {
		int[] result = new int[input.length];
        for (int i = 0; i < result.length; i++) {
            int newIndex = (i + nofoRoatation) % input.length;
            result[i] = input[newIndex];
        }
        return result;
	}
		
	}
	


