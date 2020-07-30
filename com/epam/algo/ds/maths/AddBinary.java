/**
 * 
 */
package com.epam.algo.ds.maths;

/**
 * @author Akansh_Rai
 *
 */
public class AddBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String val1 = "11100";
		String val2 = "10101";
		
		int carry = 0;
		int len1 = val1.length() - 1;
		int len2 = val2.length() - 1;
		
		String result = "";
		while (len1 >= 0 || len2 >= 0 || carry == 1) {
			carry += ((len1 >= 0) ? val1.charAt(len1) - '0' : 0);
			carry += ((len2 >= 0) ? val2.charAt(len2) - '0' : 0);
			result = (char) carry % 2 + result;
			carry /= 2;
			len1--;
			len2--;
		}
		System.out.println(result);
	}

}
