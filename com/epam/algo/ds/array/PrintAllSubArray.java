/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 * 
 */
public class PrintAllSubArray {

	/**
	 * @param args
	 */

	private static ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {
		int[] input = { 1, 2, 3 };
		int[] result = new int[input.length];
		printAllPermutation(input, 0, input.length - 1, new ArrayList<Integer>());

	}

	private static void printAllPermutation(int[] input, int left, int right, List result) {
		if (left > right)
			return;
		ArrayList<Integer> leftList = new ArrayList<>(result);
		leftList.add(input[left]);
		print(leftList);
		resultList.add(leftList);
		printAllPermutation(input, left + 1, right, leftList); // left
		printAllPermutation(input, left + 1, right, new ArrayList<>(result)); // right

	}

	private static void print(List result) {
		result.forEach(i -> System.out.print(i + " "));
		System.out.println("");
	}

}
