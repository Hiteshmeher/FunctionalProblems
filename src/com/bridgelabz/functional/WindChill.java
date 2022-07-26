package com.bridgelabz.functional;

import java.util.Scanner;
/**
 * 
 * @author HITESH
 *
 */
public class WindChill {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Taking velocity and Temperature from user as V and T
		 * Calculate the Wind Chill
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Veloity in miles per hour ");
		int v = input.nextInt();
		System.out.println("Entee Temperature in Fahrenheit)");
		int t = input.nextInt();
		double windchill = (35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
		if (t > 50 || v > 120 || v < 3) {
			System.out.println("Sorry values not in Range !!!!!");
		} else {
			System.out.println("Hence Wind Chill -> " + windchill);
		}
		input.close();
	}
}