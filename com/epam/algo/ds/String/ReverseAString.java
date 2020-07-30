/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 *
 */
public class ReverseAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "AXP";
		int left = 0;
		int right = input.length()-1;
		char ch[] = input.toCharArray();
		while (left <= right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++; right--;
		}
		System.out.println(new String(ch));
	}

}
