/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Akansh_Rai
 *
 */
public class LongestConsecutiveSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = 0;
		int arr[] = { 100, 4, 200, 3, 1, 2, };

		Set<Integer> set = new HashSet<Integer>(Arrays.stream(arr).boxed().collect(Collectors.toSet()));

		for (int val : arr) {
			if (!set.contains(val - 1)) {
				int count = 1;
				while (set.contains(val + 1)) {
					count++;
					val++;
				} // end while
				result = Math.max(result, count);
			} // end if
		}

		System.out.print("Result : " + result);
	}

}
