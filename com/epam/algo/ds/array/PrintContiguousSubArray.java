/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class PrintContiguousSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3,4 };
		int count = 0;
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(" " + arr[k]);					
				} // 3rd for end
				System.out.println("");
				count++;
			} // 2nd for end
		}
		
		
		
		System.out.println("Count " + count);
	}

}
