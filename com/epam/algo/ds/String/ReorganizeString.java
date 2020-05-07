/**
 * 
 */
package com.epam.algo.ds.String;

import java.util.Arrays;

/**
 * @author Akansh_Rai
 *
 */
public class ReorganizeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reorganizeString("aab"));
	}

	public static String reorganizeString(String input) {
		
		int len = input.length();
		int[] counts = new int[26];
		
		for (char c : input.toCharArray())
			counts[c - 'a'] += 100;
		
		for (int i = 0; i < 26; ++i)
			counts[i] += i;
		
		Arrays.sort(counts);

		char[] ans = new char[len];
		int t = 1;
		for (int code : counts) {
			int ct = code / 100;
			char ch = (char) ('a' + (code % 100));
			if (ct > (len + 1) / 2)
				return "";
			for (int i = 0; i < ct; ++i) {
				if (t >= len)
					t = 0;
				ans[t] = ch;
				t += 2;
			}
		}

		return String.valueOf(ans);
	}

}
