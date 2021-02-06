package warmup_sessions.set1;

import java.util.Arrays;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		Arrays.sort(nums);
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1])
				count++;
			else {
				count = 1;
			}
			if (count > nums.length / 2)
				return nums[i];
		}
		return -1;
	}
}
