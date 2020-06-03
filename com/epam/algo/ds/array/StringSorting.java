/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Akansh_Rai Sort strings by length
 */
public class StringSorting {

	public static void main(String[] args) {
		String[] arr = { "Akansh", "Ravi", "Amar", "Ram", "Shyam", "Phupendra" };
		System.out.println("******** Original Array ********");
		printArr(arr);

		System.out.println("******* Sorting Array in Accending **** ");
		Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
		Arrays.sort(arr, comparator);
		printArr(arr);
		System.out.println("******* Sorting Array in decending  ");
		comparator = (o1, o2) -> o2.length() - o1.length();
		Arrays.sort(arr, comparator);
		printArr(arr);
		System.out.println("******* Sorting Array in decending(if length equal sort by name)  ");
		comparator = (o1, o2) -> {
			if (o1.length() != o2.length()) {
				return o2.length() - o1.length();
			}
			return o1.compareTo(o2);
		};
		Arrays.sort(arr, comparator);
		printArr(arr);
	}

	private static void printArr(String[] arr) {
		for (String str : arr) {
			System.out.print(str + " ");
		}
		System.out.println("");
	}

}
