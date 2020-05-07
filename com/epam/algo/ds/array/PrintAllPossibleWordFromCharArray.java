/**
 * Given an array of characters and a dictionary of words, find the longest words that 
 * can be obtained by characters., i.e if array is {e,o,t,s} and
 * dictionary words are [otse,tse,eo,stoe] 
 * then function should return [otse,stoe].
 * 
 * Input : 1. dictionary = { "stoe", "etos", "so", "et", "saote", "sseeto", "sseoto" } ,  
 *            input = { 'e', 'o', 't', 's' }
 *         2. dictionary = { "otse", "tse", "eo", "stoe" }
 *            input = { 'e', 'o', 't', 's' }
 */
package com.epam.algo.ds.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Akansh_Rai
 *
 */
public class PrintAllPossibleWordFromCharArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] input = { 'e', 'o', 't', 's' };
		String[] dictionary = { "stoe", "etos", "so", "et", "saote", "sseeto", "sseoto" };// { "otse", "tse", "eo",
																							// "stoe" };

		List<String> result = new ArrayList<>();

		Set<Character> match = new HashSet<Character>();

		int maxSize = 0;

		for (int i = 0; i < input.length; i++) {
			match.add(input[i]);
		}

		for (String word : dictionary) {
			boolean isPresent = true;
			for (Character cur : word.toCharArray()) {
				if (!match.contains(cur)) {
					isPresent = false;
					break;
				}
			} // inner for

			if (isPresent) {
				if (maxSize < word.length()) {
					maxSize = word.length();
					result.clear();
					result.add(word);
				} else if (maxSize == word.length()) {
					result.add(word);
				}
			}
		} // outer for

		System.out.println("Result : " + result.toString());

	}

}
