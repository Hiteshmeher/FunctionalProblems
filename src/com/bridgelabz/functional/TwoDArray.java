package com.bridgelabz.functional;

import java.util.Scanner;
/**
 * 
 * @author HITESH
 *
 */
public class TwoDArray {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * taking size of row and column from user
		 * storing them in an array
		 * printing then row wise
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the row");
		int r = input.nextInt();
		System.out.println("Enter size of column");
		int c = input.nextInt();

		int arr[][] = new int[r][c];

		System.out.println("Enter elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		System.out.println("Here's your result ->\n");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println("\n");
		}
		input.close();
	}
}