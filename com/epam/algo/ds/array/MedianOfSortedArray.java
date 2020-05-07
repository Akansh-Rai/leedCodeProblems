/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/median-of-two-sorted-array
 * 
 * nums1 = [1, 3]nums2 = [2]
 * The median is 2.0
 *
 */
public class MedianOfSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

	public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
	       if (arr1.length > arr2.length) {
	           return findMedianSortedArrays(arr2, arr1);
	       }
	        
	        int x = arr1.length;
	        int y = arr2.length;
	        int low =0;
	        int high = x;
	        while (low <=high) {
	            int partx = (low + high)/2;
	            int party = (x+y+1)/2 - partx;
	            
	            int maxLeftX = (partx == 0) ? Integer.MIN_VALUE: arr1[partx-1];
	            int minRightX = (partx == x) ? Integer.MAX_VALUE: arr1[partx];
	            
	            int maxLeftY = (party == 0) ? Integer.MIN_VALUE: arr2[party-1];
	            int minRightY = (party == y) ? Integer.MAX_VALUE: arr2[party];
	            
	            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
	                if ((x+y)%2 == 0) {
	                    return (double)(Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
	                } else {
	                    return (double)Math.max(maxLeftX, maxLeftY);
	                }    
	            } else if (maxLeftX > minRightY) {
	                high = partx - 1;
	            } else {
	                 low = partx + 1;
	            }         
	        }
	        return 0;        
	    }
}
