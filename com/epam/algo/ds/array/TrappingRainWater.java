/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/trapping-rain-water
 *
 */
public class TrappingRainWater {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("Volume of water : " + trap(arr));
	}

	public static int trap(int[] height) {
		if (height.length == 0 || height.length == 1)
			return 0;

		int len = height.length;
		int leftMax[] = new int[len];
		int rightMax[] = new int[len];
		int max = 0;
		for (int i = 0; i < len; i++) {
			max = Math.max(max, height[i]);
			leftMax[i] = max;
		} // end leftmax
		max = 0;
		for (int i = len - 1; i >= 0; i--) {
			max = Math.max(max, height[i]);
			rightMax[i] = max;
		} // end rightmax

		int result = 0;
		for (int i = 0; i < len; i++) {
			result = result + (Math.min(leftMax[i], rightMax[i]) - height[i]);
		}
		return result;
	}

}
