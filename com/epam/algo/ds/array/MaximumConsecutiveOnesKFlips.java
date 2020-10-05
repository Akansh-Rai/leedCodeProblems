/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * https://www.youtube.com/watch?v=TAMLsfGiyOg9
 *
 */
public class MaximumConsecutiveOnesKFlips {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 1, 0, 0, 0, 1, 1, 1, 1 };
		int k = 2;
		int left = 0;
		int countZero = 0;
		int result = 0;
		for (int right = 0; right < arr.length; right++) {
			if (arr[right] == 0) {
				countZero++;
			}
			while (countZero > k) {
				if (arr[left++] == 0) {
					countZero--;
				}
			}

			result = Math.max(result, right - left + 1);
		} // end for
		System.out.println("Result : " + result);
	}

}
