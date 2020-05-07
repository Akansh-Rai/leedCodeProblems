/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 * Input : 
 *        k=7 , arr = { 1, 3, 4, 7, 2, -3, 1, 4, 2 };  Output : 4
 *        {10, 2, -2, -20, 10},  k = -10    Output : 3
 *        
 *        RunTime : O(n2)
 *
 */
public class SubarraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {10, 2, -2, -20, 10};
		int k = -10;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == k)
					count++;
			}
		} // end for

		System.out.println("Number of sub Arrays with sum " + k + " is " + count);

	}

}
