package com.bridgelabz.functional;

import java.util.Scanner;
/**
 * 
 * @author HITESH
 *
 */
public class Quadratic {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * taking values of a, b and c from user
		 * calculating roots for the equation
		 */
		Double root1;
		Double root2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for a");
		Double a = input.nextDouble();
		System.out.println("Enter value for b");
		Double b = input.nextDouble();
		System.out.println("Enter value for c");
		Double c = input.nextDouble();
		Double delta = (b * b) - (4 * a * c);
		System.out.println("Root  = " + delta);
		
		if (delta > 0) {
			System.out.println("Roots not equal !!!!");
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots " + root1);
			System.out.println("Roots " + root2);
		} else if (delta == 0) {
			System.out.println("Roots are equal !!!!");
			root1 = -b / (2 * a);
			root2 = -b / (2 * a);
			System.out.println("Roots " + root1);
			System.out.println("Roots " + root2);
		} else if (delta < 0) {
			System.out.println("Roots are imaginary !!!!! ");
			root1 = 0.0;
			root2 = 0.0;
			System.out.println("Root1 is " + root1);
			System.out.println("Root2 is " + root2);
		}
		input.close();
	}
}