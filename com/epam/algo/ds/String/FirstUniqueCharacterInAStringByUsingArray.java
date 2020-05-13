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
public class FirstUniqueCharacterInAStringByUsingArray {

	public static void main(String[] args) {
		System.out.println("leetcode - First Unique Character in a String : " + firstUniqueCharInAString("leetcode"));

		System.out.println(
				"loveleetcode - First Unique Character in a String : " + firstUniqueCharInAString("loveleetcode"));
	}

	private static int firstUniqueCharInAString(String input) {
		int[] arr = new int[26];
		for (int i = 0; i < input.length(); i++) {
			char cur = input.charAt(i);
			int index = cur - 'a';
			arr[index] += 1;
		}

		for (int i = 0; i < input.length(); i++) {
			char cur = input.charAt(i);
			int index = cur - 'a';
			if (arr[index] == 1)
				return i;
		}

		return -1;
	}
}
