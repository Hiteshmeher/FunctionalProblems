package com.bridgelabz.functional;

import java.util.Scanner;
/**
 * 
 * @author HITESH
 *
 */
public class Distance {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * taking value of x and y from user. 
		 * as coordinate (x,y)
		 * calculating its distance from origin (0,0)
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of x");
		Double x = input.nextDouble();
		System.out.println("Enter value of y");
		Double y = input.nextDouble();
		Double Distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println("Distance from origin (0,0) to (" +x+ "," +y+ ") is " + Distance);
		input.close();
	}
}
