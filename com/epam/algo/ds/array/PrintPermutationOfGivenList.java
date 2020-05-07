/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
 */
public class PrintPermutationOfGivenList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "abcd";
		printPermutation(input, 0, input.length() - 1);
	}

	private static void printPermutation(String input, int left, int right) {
		if (left == right) {
			System.out.println(input);
		} else {
			for (int i = left; i <= right; i++) {
				input = swap(input, i, left);
				printPermutation(input, left + 1, right);
				input = swap(input, i, left);
			}
		}

	}

	private static String swap(String input, int left, int right) {
		char[] charArray = input.toCharArray();
		char temp = charArray[left];
		charArray[left] = charArray[right];
		charArray[right] = temp;
		return String.valueOf(charArray);
	}

}
