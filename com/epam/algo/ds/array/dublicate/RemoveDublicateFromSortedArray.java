/**
 * 
 */
package com.epam.algo.ds.array.dublicate;

/**
 * @author Akansh_Rai
 *         https://www.youtube.com/watch?v=gf7vdIin0dk&list=PLeIMaH7i8JDjd21ZF6jlRKtChLttls7BG&index=2
 *
 */
public class RemoveDublicateFromSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 3, 3, 4, 4, 5 };

		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] != arr[j])
				arr[++i] = arr[j];
		}

	}

}
