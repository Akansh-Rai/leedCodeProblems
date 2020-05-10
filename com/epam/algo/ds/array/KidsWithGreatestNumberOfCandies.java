/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 *         Input: candies = [2,3,5,1,3], extraCandies = 3 Output:
 *         [true,true,true,false,true]
 */
public class KidsWithGreatestNumberOfCandies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies, extraCandies).toString());
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		// find max
		int max = 0;
		for (int val : candies) {
			if (val > max)
				max = val;
		}

		List<Boolean> result = new ArrayList<Boolean>();
		for (int val : candies) {
			result.add(val + extraCandies >= max);
		}
		return result;
	}

}
