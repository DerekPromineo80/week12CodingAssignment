package com.promineotech;


import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;



class TestDemoJUnitTest {

	private TestDemo testDemo; // Adding private instance variable for Step 1-4
	
	// Step 1-4.a
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
	}
	

	
	// Step 1-4.j : Add the parameter for the Source Method (for assertThatTwoPositiveNumbersAreAddedCorrectly)
	static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(
		
		arguments(2, 4, 6, false),			// (Number to add 2, Number to add 4, Sum 6, Expecting Exception? False)
		arguments(2, 2, 4, false),
		arguments(25, 25, 50, false),
		arguments(0, 0, 0, true),
		arguments(0, 1, 1, true),
		arguments(-1, -2, -3, true)
		
		
		);
	}
		 
	
	
	// Step 1-4.b
	@ParameterizedTest
	// Step 1-4.k
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
		
		if(!expectException) {
			  assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> testDemo.addPositive(a, b))
	       		.isInstanceOf(IllegalArgumentException.class);
		}
	}

	
	
	
	// Step 2-1
	@Test
	void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
		assertThat(testDemo.addPositive(4,5)).isEqualTo(9);
		assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
		assertThat(testDemo.addPositive(5,6)).isEqualTo(11);
		assertThat(testDemo.addPositive(7,8)).isEqualTo(15);
		assertThat(testDemo.addPositive(400,500)).isEqualTo(900);
	}
	
	
	
	// Step 3-2.
	@Test
	void assertThatNumberReturnedMatches() {
		assertThat(testDemo.returnNumber(4)).isEqualTo(4);
		assertThat(testDemo.returnNumber(8)).isEqualTo(8);
		assertThat(testDemo.returnNumber(12)).isEqualTo(12);
	}
	
	// Step 3-2.
	@Test
	void assertThatNumberIsCubed() {
		assertThat(testDemo.numberCubed(5)).isEqualTo(125);
		assertThat(testDemo.numberCubed(6)).isEqualTo(216);
		assertThat(testDemo.numberCubed(7)).isEqualTo(343);
	}
	
	
	
	// Step 4-2.a
	@Test
	void assertThatNumberSquaredIsCorrect() {
		TestDemo mockDemo = spy(testDemo);	
		
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);
		
		// Second Mock 
		doReturn(6).when(mockDemo).getRandomInt();
		int sixSquared = mockDemo.randomNumberSquared();
		assertThat(sixSquared).isEqualTo(36);
	}

}






