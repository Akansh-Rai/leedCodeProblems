/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/subarrays-with-k-different-integer
 * 
 * 
 *
 */
public class SubarraysWithKDifferentIntegers {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 2, 3 };
		int k = 2;
		System.out.println("result : " + subarraysWithKDistinct(arr, k));
	}

	public static int subarraysWithKDistinct(int[] arr, int K) {
		return subarraysWithAtMostNDistinctNumbers(arr, K) - subarraysWithAtMostNDistinctNumbers(arr, K - 1);
	}

	private static int subarraysWithAtMostNDistinctNumbers(int[] arr, int N) {

		int result = 0;
		int numberOfUniqueNumbersInCurrentSlidingWindow = 0;
		int left = 0;
		int right = 0;
		Map<Integer, Integer> slidingWindowCountMap = new HashMap<>();
		while (right < arr.length) {
			int numAtRightIndex = arr[right];
			slidingWindowCountMap.put(numAtRightIndex, slidingWindowCountMap.getOrDefault(numAtRightIndex, 0) + 1);

			while (slidingWindowCountMap.size() == N + 1) {
				int numAtLeftIndex = arr[left];
				int countOfNumAtLeftIndexInCurrentSlidingWindow = slidingWindowCountMap.get(numAtLeftIndex);

				// if the count is greaterThan 1 then we just decrement the count by 1
				// otherwise we remove it from the slidingWindowMap
				// We need to do this because our slidingWindowLogic is based on map size
				if (countOfNumAtLeftIndexInCurrentSlidingWindow > 1) {
					slidingWindowCountMap.put(numAtLeftIndex, countOfNumAtLeftIndexInCurrentSlidingWindow - 1);
				} else {
					slidingWindowCountMap.remove(numAtLeftIndex);
				}
				left++;
			}

			// when we get here, right index has definitely moved away from last time we
			// took the count
			// additionally left index count have moved as well, if the inner while loop was
			// run
			int numberOfSubArraysInCurrentSlidingWindowEndingAtRightIndex = right + 1 - left;

			// Add the above number of unique sub arrays to the final result
			result += numberOfSubArraysInCurrentSlidingWindowEndingAtRightIndex;
			right++;
		}

		return result;

	}

}
