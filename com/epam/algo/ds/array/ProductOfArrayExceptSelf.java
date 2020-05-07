/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/product-of-array-except-self/solution/
 * Given an array nums of n integers where n > 1,  
 * return an array output such that output[i] is equal to the product 
 * of all the elements of nums except nums[i].
 * Example:  
 *         Input:  [1,2,3,4] 
 *         Output: [24,12,8,6]
 */
public class ProductOfArrayExceptSelf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input[] = { 1, 2, 3, 4 };
		input = productExceptSelf(input);
		for (int val : input) {
			System.out.print(val + "  ");
		}
	}

	public static int[] productExceptSelf(int[] arr) {
		int length = arr.length;

		int[] left = new int[length];
		int[] right = new int[length];
		int[] answer = new int[length];

		left[0] = 1;
		for (int i = 1; i < length; i++)
			left[i] = arr[i - 1] * left[i - 1];

		right[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--)
			right[i] = arr[i + 1] * right[i + 1];

		for (int i = 0; i < length; i++)
			answer[i] = left[i] * right[i];

		return answer;
	}

}
