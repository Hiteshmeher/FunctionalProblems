package com.bridgelabz.functional;

import java.util.Scanner;
/**
 * 
 * @author LENOVO
 *
 */
public class SumOfIntegerZero {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Howmany numbers you want ");
		int N = input.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter the numbers");
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					} else
						System.out.println("numbers are not equal");
				}
			}
		}
		input.close();
	}
}