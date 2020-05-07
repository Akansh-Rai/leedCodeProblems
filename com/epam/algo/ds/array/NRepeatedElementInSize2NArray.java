/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * In a array A of size 2N, there are N+1 unique elements, and exactly
 * one of these elements is repeated N times.
 * Return the element repeated N times.
 * 
 *  Note: 
 *        1. 4 <= A.length <= 10000
 *        2. 0 <= A[i] < 10000
 *        3. A.length is even
 */
public class NRepeatedElementInSize2NArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {5,1,5,2,5,3,5,4}; // output : 5
		System.out.println(repeatedNTimes(arr));

	}
	
	public static int repeatedNTimes(int[] arr) {
        for (int k = 1; k <= 3; ++k)
            for (int i = 0; i < arr.length - k; ++i)
                if (arr[i] == arr[i+k])
                    return arr[i];

        throw null;
    }
	

}
