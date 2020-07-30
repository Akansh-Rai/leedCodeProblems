/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class SecondSmallestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 12 ,5, 8, 3, 7, 9, 12 , 11 };
		System.out.println(findSecondHighest(arr));
	}

	private static int findSecondHighest(int[] arr) {
		if (arr.length <= 1)
			return -1;
		int max = arr[0];
		int secondMax = arr[1];
		if (max < secondMax) {
			int temp = secondMax;
			secondMax = max;
			max = temp;
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > secondMax) {
				if (arr[i] > max) {
					secondMax = max;
					max = arr[i];
				} else {
					secondMax = arr[i];
				}
			}
		}

		return secondMax;
	}

}
