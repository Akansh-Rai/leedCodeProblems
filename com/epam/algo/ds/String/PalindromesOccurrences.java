/**
 * 
 */
package com.epam.algo.ds.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 * 
 *         This is O(N2) soluction.
 * 
 *         Question :
 *         https://www.geeksforgeeks.org/count-palindrome-sub-strings-string/
 * 
 *         Given a string, the task is to count all palindrome sub string in a
 *         given string. Length of palindrome sub string is greater than or
 *         equal to 2.
 * 
 *         Input : str = "abbaeae" Output: 4 Explanation : All palindrome
 *         substring are : "bb" , "abba" ,"aea","eae"
 *
 */
public class PalindromesOccurrences {

	public static void main(String[] args) {

		String input = "abbaeae";
		//abcccba
		int length = input.length(), ans = 0;

		for (int center = 0; center <= 2 * length - 1; center++) {
			int left = center / 2;
			int right = left + center % 2;
			while (left >= 0 && right < length && input.charAt(left) == input.charAt(right)) {
				if (left != right)
					ans++;
				left--;
				right++;
			}
		}
		System.out.println(ans);
	}

}
