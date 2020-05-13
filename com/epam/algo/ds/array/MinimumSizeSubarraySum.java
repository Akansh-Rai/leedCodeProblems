package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class MinimumSizeSubarraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int sum = 7;
		 int[] nums = { 2, 3, 1, 2, 4, 3 };

		/*int sum = 4;
		int[] nums = { 1, 4, 4 };*/
		System.out.println("Minimum Size Subarray Sum : " + minimumSizeSubarraySum(nums, sum));
	}

	private static int minimumSizeSubarraySum(int[] arr, int sum) {
		if (arr.length == 0) return 0;
	       int size = Integer.MAX_VALUE;
			int curSum = arr[0];
			int left = 0;
			int right = 0;
	        
			while (left <= right && right < arr.length) {
				if (curSum >= sum) {
					size = Math.min(size, right + 1 - left);
					curSum -= arr[left];
					left++;
				} else if (curSum > sum) {
					curSum -= arr[left];
					left++;
				} else {
					right++;
					if (right < arr.length) curSum += arr[right];
				}
			} // end while
	        
			return size == Integer.MAX_VALUE ? 0 : size;
	}

}
