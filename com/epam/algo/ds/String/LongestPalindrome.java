/**
 * 
 */
package com.epam.algo.ds.String;import javax.swing.text.PlainDocument;

/**
 * @author Akansh_Rai
 *
 */
public class LongestPalindrome {

	public static void main(String[] args) {
		
		String input = "abbaeae";
		int length = input.length();
		int maxPalin = 0;
		String longPalin = "";
		
		for (int center = 0; center < 2 * length -1; center++) {
			int left = center /2;
			int right = left + center%2;
			while (left >= 0 && right < length && 
					input.charAt(left)== input.charAt(right)) {
				if (left != right) {
					//maxPalin = Math.max(maxPalin,  right - left + 1);
					int curLen = right - left + 1;
					if (maxPalin < curLen) {
						maxPalin = curLen;
						longPalin = input.substring(left, right+1);
					}
				}
				left--;
				right++;
			}// end while
		}// end for
		System.out.println(" Maximum Palimdrom length in  " + input + " is : " + maxPalin);
		System.out.println("Palimdro is : " + longPalin);
	}

}
