package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
			if (n == 0) {
				return 0;
			}
			double sum = (double) geometricSum(n-1) + (1/(Math.pow(2, n)));
			return sum;
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
		if (p % q == 0) {
			return q;
		}
		else {
			return gcd(q, p%q);
		}

	}

	
	public static int index(int m) {
		if (m == 0) {
			return 0;
		} else {
			m = m-1;
			return m; 
		}
		
		
	}
	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	
	
	public static int[] toReversed(int[] array) {

		int m = array.length;
		

		int index = m;
		int[] newArray = new int[m];
		
			// FIXME create a helper method that can recursively reverse the given array
		if (array.length == 0) {
			return array;
		} else if (array.length == 1) {
			return array;
		} else {
			newArray[index] = array[array.length - 1 - index];
			index(index);
			toReversed(array);
			return newArray;
		}
			
		
	}
	

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
