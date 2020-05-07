/**
 * 
 */
package com.epam.algo.ds.array.sort;

/**
 * @author Akansh_Rai
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 5,3,7,1,8,4,4,2 };
			selectionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	private static void selectionSort(int[] arr) {
		for (int i= 0 ; i < arr.length-1; i++) {
		   for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}

}
