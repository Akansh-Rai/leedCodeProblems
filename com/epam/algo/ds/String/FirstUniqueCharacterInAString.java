/**
 * 
 */
package com.epam.algo.ds.String;

import java.util.HashMap;

/**
 * 
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 */
public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		String input = "leetcode";
		System.out.println("First Unique Character in a String : " + firstUniqueCharInAString(input));
	}

	private static int firstUniqueCharInAString(String input) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		int len = input.length();

		for (int i = 0; i < len; i++) {
			char c = input.charAt(i);
			count.put(c, count.getOrDefault(c, 0) + 1);
		}

		for (int i = 0; i < len; i++) {
			if (count.get(input.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
}
