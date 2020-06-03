/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 *         Given a string, find the length of the longest substring without
 *         repeating characters. Example 1: Input: "abcabcbb" Output: 3
 *         Explanation: The answer is "abc", with the length of 3. Example 2:
 *         Input: "bbbbb" Output: 1 Explanation: The answer is "b", with the
 *         length of 1. Example 3: Input: "pwwkew" Output: 3 Explanation: The
 *         answer is "wke", with the length of 3. Note that the answer must be a
 *         substring, "pwke" is a subsequence and not a substring.
 * 
 *         Example 4: Input = " " output : 1 // should work for whitespace or
 *         any char
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String input = "abcabcbb";
		int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
		System.out.println("The answer is \"" + input + "\", with the length of " + result);

		input = "pwwkew";
		result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
		System.out.println("The answer is \"" + input + "\", with the length of " + result);
	}

	public static int lengthOfLongestSubstring(String input) {
		if (input == null || input.isEmpty())
			return 0;

		int[] map = new int[512];
		int result = 0;
		int i = 0;
		int j = 0;
		while (j < input.length()) {
			int index = input.charAt(j);
			if (map[index] == 0) {
				map[index] = map[index] + 1;
				j++;
			} else {
				result = Math.max(result, j - i);
				index = input.charAt(i);
				map[index] = map[index] - 1;
				i++;
			}
		} // end
		return Math.max(result, j - i);
	}

}
