/**
 * 
 */
package com.epam.algo.ds.array;

import java.math.BigInteger;

/**
 * @author Akansh_Rai
 *
 */
public class PrintSubArray2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int n = arr.length;
		int opsize = (int) Math.pow(2, n);

		for (int counter = 1; counter < opsize; counter++) {
			for (int j = 0; j < n; j++) {
				if (BigInteger.valueOf(counter).testBit(j))
					System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

	}

}
