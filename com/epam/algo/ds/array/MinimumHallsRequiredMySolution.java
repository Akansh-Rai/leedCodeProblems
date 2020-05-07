/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.Arrays;

/**
 * @author Akansh_Rai
 *
 */
public class MinimumHallsRequiredMySolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int lectures[][] = { { 0, 5 }, { 1, 2 }, { 1, 10 }, {10,11} , {9,10} };
		int n = lectures.length;

		System.out.println(minHalls(lectures, n));
	}

	private static int minHalls(int[][] lectures, int n) {
		int meetingRoomRequired = 0;
		int[] start = new int[n];
		int end[] = new int[n];
		for (int i = 0; i < n; i++) {
			start[i] = lectures[i][0];
			end[i] = lectures[i][1];
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int j=0, i =0;
		int meetings = 0;
		while (i < n && j < n) {
			if (start[i] < end[j]) {
				meetings++;
				i++;
				meetingRoomRequired = Math.max(meetingRoomRequired, meetings);
			} else {
				meetings--;
				j++;
			}
		}

		return meetingRoomRequired;
	}

}
