/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,4,6,8,3,10,7};
		printArr(bubbleSort(arr));

	}

	private static int[] bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length; i++ ) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				} 
			}
		}
		return arr;
	}
	
	private static void printArr(int[] arr) {
		for(int val : arr)
			System.out.print(val + " ");
	}

}
