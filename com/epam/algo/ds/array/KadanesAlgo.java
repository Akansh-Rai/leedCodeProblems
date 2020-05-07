/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class KadanesAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {5, 7, -3, 2, 9, 6, 16, 22, 21, 29, -14, 10, 12};//{ 1, -3, 2, 1, -1 };

		int sum = arr[0];
		int curSum = sum;

		for (int i = 1; i < arr.length; i++) {
			curSum += arr[i];
			if (curSum < 0)
				curSum = 0;
			sum = Math.max(sum, curSum);
		}
		System.out.println("Maximum sum of SubArray : " + sum);
	}

}
