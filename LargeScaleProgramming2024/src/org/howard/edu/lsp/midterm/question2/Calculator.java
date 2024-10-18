package org.howard.edu.lsp.midterm.question2;

public class Calculator {


	    // sum of two integers
	    public static int sum(int a, int b) {
	        return a + b;
	    }

	    // sum of two double values
	    public static double sum(double a, double b) {
	        return a + b;
	    }

	    // sum of all elements in an array of integers
	    public static int sum(int[] numbers) {
	        int total = 0;
	        for (int num : numbers) {
	            total += num;
	        }
	        return total;
	    }
	}


