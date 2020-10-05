/**
 * 
 */
package com.epam.algo.ds.maths;

/**
 * @author Akansh_Rai
 *
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(20));
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(64));
		System.out.println(isPowerOfTwo(8));
	}

	public static boolean isPowerOfTwo(int number) {
		double div = Math.log(number) / Math.log(2);
		return Math.floor(div) == Math.ceil(div);
	}

}
