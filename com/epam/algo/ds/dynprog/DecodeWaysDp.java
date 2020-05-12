/**
 * 
 */
package com.epam.algo.ds.dynprog;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/decode-ways
 *
 */
public class DecodeWaysDp {

	public static void main(String[] args) {
		System.out.println("Decode 0 in ways : " + numDecodings("0"));
		System.out.println("Decode 0126 in ways : " + numDecodings("0126"));
		System.out.println("Decode 126 in ways : " + numDecodings("126"));
		System.out.println("Decode 1026 in ways : " + numDecodings("1026"));
	}

	public static int numDecodings(String input) {
		int len = input.length();
		if (len == 0)
			return 0;
		int ways[] = new int[len + 1];

		ways[0] = 1;
		ways[1] = input.charAt(0) != '0' ? 1 : 0;
		for (int i = 2; i <= len; i++) {
			if (input.charAt(i - 1) != '0') {
				ways[i] = ways[i - 1];
			}
			int val = (input.charAt(i - 2) - '0') * 10 + (input.charAt(i - 1) - '0');
			if (val <= 26 && val >= 10) {
				ways[i] = ways[i] + ways[i - 2];
			}
		}
		return ways[len];

	}

}
