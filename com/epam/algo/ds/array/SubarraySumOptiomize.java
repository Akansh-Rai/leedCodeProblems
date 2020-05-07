/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.HashMap;

/**
 * @author Akansh_Rai
 * 
 *         Input : k=7 , array = { 1, 3, 4, 7, 2, -3, 1, 4, 2 }; Output : 4 {10,
 *         2, -2, -20, 10}, k = -10 Output : 3
 * 
 *         RunTime : O(n) Extra memory O(n)
 * 
 *         k = -10 arr[] = { 10, 2, -2, -20, 10 } ====> Output : 3
 *
 */
public class SubarraySumOptiomize {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 7, 2, -3, 1, 4, 2 };
		int k = 7;
		HashMap<Integer, Integer> prevSum = new HashMap<>();

		int res = 0;

		int currsum = 0;

		for (int i = 0; i < arr.length; i++) {

			currsum += arr[i];

			if (currsum == k)
				res++;

			if (prevSum.containsKey(currsum - k))
				res += prevSum.get(currsum - k);

			Integer count = prevSum.get(currsum);
			if (count == null)
				prevSum.put(currsum, 1);
			else
				prevSum.put(currsum, count + 1);
		}

		System.out.println("Number of sub Arrays with sum " + k + " is " + res);

	}

}
