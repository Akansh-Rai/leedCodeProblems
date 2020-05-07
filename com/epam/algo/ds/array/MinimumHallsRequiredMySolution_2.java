/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.Arrays;

/**
 * @author Akansh_Rai
 *
 */
public class MinimumHallsRequiredMySolution_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int lectures[][] = { { 0, 5 }, { 1, 2 }, { 1, 10 }, { 10, 11 }, { 9, 10 } };
		int n = lectures.length;

		System.out.println(minHalls(lectures, n));
	}

	private static int minHalls(int[][] lectures, int n) {
		int meetingRoomRequired = 0;
		int[] booked = new int[30];

		for (int i = 0; i < n; i++) {
			int current = booked[i];
			current++;
			int start = lectures[i][0];
			int end = lectures[i][1];
			while(start < end) {
				booked[start] = current;
				start++;
			}
		}
		
		
		

		return meetingRoomRequired;
	}

}
