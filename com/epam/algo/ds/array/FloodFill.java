package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/flood-fill/
 *
 */
public class FloodFill {

	public static void main(String[] args) {
		int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		System.out.println("Input : \n");
		print(image);
		int x = 1;
		int y = 1;
		int newColor = 2;
		image = floodFill(image, x, y, newColor);
		System.out.println("\n**** Output **** : \n");
		print(image);
	}

	public static int[][] floodFill(int[][] image, int x, int y, int newColor) {
		if (image[x][y] == newColor)
			return image;
		fill(image, x, y, image[x][y], newColor);
		return image;
	}

	private static void fill(int[][] image, int x, int y, int color, int newColor) {
		if (x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] != color)
			return;
		image[x][y] = newColor;
		fill(image, x + 1, y, color, newColor);
		fill(image, x - 1, y, color, newColor);
		fill(image, x, y + 1, color, newColor);
		fill(image, x, y - 1, color, newColor);
	}

	private static void print(int[][] image) {
		for (int i = 0; i < image.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < image[i].length; j++) {
				System.out.print(" " + image[i][j]);
			}
			System.out.println("] ");
		}

	}
}
