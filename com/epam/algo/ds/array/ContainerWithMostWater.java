/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("Result : " + maxArea(arr));
	}

	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int area = 0;
		while (left < right) {
			area = Math.max(area, Math.min(height[left], height[right]) * (right - left));

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return area;
	}

}
