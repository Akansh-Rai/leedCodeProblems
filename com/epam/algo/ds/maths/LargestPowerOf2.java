/**
 * 
 */
package com.epam.algo.ds.maths;

/**
 * @author Akansh_Rai
 * https://www.baeldung.com/java-largest-power-of-2-less-than-number
 */
public class LargestPowerOf2 {
	
	public static void main(String[] args) {
		int input = 9;
		
		int result = (int) (Math.log(9)/Math.log(2));
		System.out.println(Math.log(9));
		System.out.println(Math.log(2));
		System.out.println(result);
	}

}
