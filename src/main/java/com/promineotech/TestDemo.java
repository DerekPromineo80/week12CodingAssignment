package com.promineotech;

import java.util.Random;

// Derek McGuire Week 12 Coding Assignment

public class TestDemo {
	
	
	/**
	 * Step 1-2.a.
	 * @param a is a positive Integer
	 * @param b is a positive Integer
	 * @return an int that is the sum of a and b
	 */
	public int addPositive(int a, int b) {
		if ((a > 0) && (b > 0)) {
			return a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	
	
	/**
	 * Step 3: Create your own method & JUnit Test
	 * Takes an integer number and returns the same number back
	 * @param a: an Integer number
	 * @return the same Integer number
	 */
	public int returnNumber(int a) {
		return a;
	}
	
	
	/**
	 * Step 3: Create your own method (Second One)
	 * Takes an Integer and Cubes it
	 * @param a takes an Integer a
	 * @return the Integer to the power of 3 (cubed)
	 */
	public int numberCubed(int a) {
		int numCubed = a * a * a;
		return numCubed;
	}
	
	
	/**
	 * Step 4-1.a
	 * Makes a call to the method getRandomInt() and stores it
	 * @return returns the random integer Squared
	 */
	public int randomNumberSquared() {
		int numSquared = getRandomInt();
		return numSquared * numSquared;
	}
	
	
	
	/**
	 * Step 4-1.b
	 * Uses "java.util.Random" method to generate a random number between 1 and 10
	 * @return that random number 
	 */
	public int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
	
	
}

