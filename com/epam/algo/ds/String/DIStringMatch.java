/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/di-string-match/
 * 
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 * 		If S[i] == "I", then A[i] < A[i+1]
 * 		If S[i] == "D", then A[i] > A[i+1]
 * 
 */
public class DIStringMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = diStringMatch("IDID");
		for(int i : arr) {
			System.out.println("" + i);
		}
	}
	
	private static int[] diStringMatch(String input) {
        if (input == null || input.length() == 0) return new int[0];
        
        int inputLength = input.length();
        int[] arr = new int[inputLength+1];
        int index = 0;
        int i=0; int d = inputLength;
        while (index < inputLength) {
            if ('I' == input.charAt(index)) {
                arr[index] = i++;
            } else {
                arr[index] = d--;;
            }
            index++;
        }
        arr[index] = i++;
        return arr;
            
    }

}
