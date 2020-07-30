/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class FlipStringToMonotoneIncreasing {

	public static int minFlipsMonoIncr(String S) {
		int n = S.length();
		int suffix = 0;
		for (int i = n - 1; i >= 0; i--) {
			suffix += (S.charAt(i) == '0' ? 1 : 0);
		}

		int answer = Integer.MAX_VALUE;
		int onesSeen = 0;

		for (int i = 0; i < n; i++) {
			answer = Math.min(answer, onesSeen + suffix);

			if (S.charAt(i) == '1') {
				onesSeen++;
			} else {
				suffix -= 1;
			}

			answer = Math.min(answer, onesSeen + suffix);
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println("00110 : " + minFlipsMonoIncr("00110"));
		System.out.println("010110 : " + minFlipsMonoIncr("010110"));
		System.out.println("0001100 : " + minFlipsMonoIncr("0001100"));
	}

}
