/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class PrintAllPossibleStringWithLengthK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("First Test");
		char[] input = { 'a', 'b' };
		int k = 3;
		printAllKLength(input, "", input.length, k);

	}

	private static void printAllKLength(char[] input, String prefix, int length, int k) {
		if (k == 0) {
			System.out.println(" " + prefix);
			return;
		}

		for (int i = 0; i < length; ++i) {
			String newPrefix = prefix + input[i];
			printAllKLength(input, newPrefix, length, k - 1);
		}

	}

}
