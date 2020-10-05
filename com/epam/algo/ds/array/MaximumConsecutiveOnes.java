/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *  https://www.youtube.com/watch?v=OaMbeeSSv7Y
 *  
 *  Maximum Consecutive Ones II (If we can flip at most one 0)
 *
 */
public class MaximumConsecutiveOnes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1 };
		System.out.println(MaximumConsecutiveOnes(arr));
	}

	private static int MaximumConsecutiveOnes(int[] arr) {
		int oneCount = 0;
		int left = 0;
		int zeroCount = 0;
		for (int right = 0; right < arr.length; right++) {
			if (arr[right] == 0)
				zeroCount++;
			while (zeroCount > 1) {
				if (arr[left] == 0) {
					zeroCount--;
				}
				left++;
			}

			oneCount = Math.max(oneCount, right - left + 1);
		}
		return oneCount;
	}

}
