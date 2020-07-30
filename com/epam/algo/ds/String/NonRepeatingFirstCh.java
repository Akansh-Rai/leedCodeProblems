/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 * 
 *         https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
 *         
 *         ignore case
 *
 */
public abstract class NonRepeatingFirstCh {

	public static void main(String[] args) {
		String input1 = "GeeksForGeeks";
		String input2 = "GeeksQuiz";
		System.out.println(findFirstNonRepeatingChar(input1));
		System.out.println(findFirstNonRepeatingChar(input2));
	}

	private static char findFirstNonRepeatingChar(String input) {
		int[] set = new int[26];
		input = input.toLowerCase();
		for(Character ch : input.toCharArray()) {
			int index = ch - 'a';
			set[index] = set[index] + 1;  
		}
		
		for(Character ch : input.toCharArray()) {
			int index = ch - 'a';
			if (set[index] == 1) return ch;  
		}
		return '@';
	}

}
