package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


 class MathUtilsTest{

	     private final MathUtils mathUtils = new MathUtils();

	 // factorial method
	     @Test
	     void testFactorial_IsValidInput() {
	         
	         assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
	     }
	     
	     @Test
	     void testFactorial_OfOne() {
	         assertEquals(1, mathUtils.factorial(1), "Factorial of 1 should be 1");
	     }
	     
	     @Test
	     void testFactorial_OnInputZero() {

	         assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
	     }
	     
	     @Test
	     void testFactorial_OfLargeNum() {
	         assertEquals(5040, mathUtils.factorial(7), "Factorial of 7 should be 5040");
	     }

	     @Test
	     void testFactorial_NegativeInput() {
	         // throw exception
	         assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1), "Negative input should throw an exception");
	     }
	     

	     
	     @Test
	     void testIsPrime_EdgeCases() {
	         assertFalse(mathUtils.isPrime(0), "0 should is not a prime number");
	         assertFalse(mathUtils.isPrime(1), "1 should is not a prime number");
	     }

	//IsPrime
	     @Test
	     void testIsPrime_NotAPrimeNumber() {
	        
	         assertFalse(mathUtils.isPrime(8), "8 shouldn't be a prime number");
	     }
	     
	     @Test
	     void testIsPrime_PrimeNumber() {
	     
	         assertTrue(mathUtils.isPrime(7), "7 should be prime");
	     }

	     @Test
	     void testIsPrime_LessThanTwo() {
	         
	         assertFalse(mathUtils.isPrime(1), "1 should not be a prime number");
	     }

// GCD method
	     @Test
	     void testGcd_ValidInput() {
	        
	         assertEquals(6, mathUtils.gcd(48, 18), "GCD of 48 and 18 should be 6");
	     }

	     @Test
	     void testGcd_OnZeroInput() {
	        
	         assertEquals(18, mathUtils.gcd(0, 18), "GCD of 0 and 18 should be 18");
	     }

	     @Test
	     void testGcd_BothInputsZero() {
	        
	         assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0), "Both inputs should not zero");
	     }
	 }

	 
 