package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class IntersectionTwoArraysII {
	
	/*  https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
	 * 
	 */
	
	@Test
	public void test1() {
		intersect(new int[] {4,9,5},new int[] {9,4,9,8,4});
	}
	
	@Test
	public void test2() {
		intersect2(new int[] {4,9,5},new int[] {9,4,9,8,4});
	}
	
	
	private int[] intersect2(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Integer> arr = new ArrayList<>();
		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				arr.add(num);
				map.put(num, map.get(num) - 1);
			}
		}

		int[] result = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			result[i] = arr.get(i);
		}
		return result;
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int left = 0, right = 0;
		while (left < nums1.length && right < nums2.length) {
			if (nums1[left] < nums2[right]) {
				left++;
			} else if (nums1[left] > nums2[right]) {
				right++;
			} else {
				arr.add(nums1[left]);
				left++;
				right++;
			}
		}
		int[] result = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			result[i] = arr.get(i);
		}
		return result;
		
	}

}
