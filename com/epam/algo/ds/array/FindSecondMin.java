/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class FindSecondMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int input[] = { 44, 66, 99, 77, 33, 22, 55 };
		if (input.length <= 1) {
			System.out.println("Wrong input array");
			return;
		}

		int min = input[0], secondMin = input[1];
		if (min > secondMin) {
			secondMin = min;
			min = input[0];
		}

		for (int i = 2; i < input.length; i++) {
			if (input[i] >= secondMin)
				continue;
			if (input[i] > min && input[i] < secondMin) {
				secondMin = input[i];
				continue;
			}
			if (input[i] < min) {
				secondMin = min;
				min = input[i];
			}
		}

		System.out.print("Second Min : " + secondMin);

	}

}
