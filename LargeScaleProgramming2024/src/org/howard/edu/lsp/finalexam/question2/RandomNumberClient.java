package org.howard.edu.lsp.finalexam.question2;


/**
 * Client program to test the RandomNumberService with different strategies.
 */
public class RandomNumberClient {

    public static void main(String[] args) {
        // Get the singleton instance of RandomNumberService
        RandomNumberService randomNumberService = RandomNumberService.getInstance();

        // Show Java Random Strategy
        System.out.println("Using Java Random Strategy:");
        randomNumberService.setStrategy(new RandomNumberService.JavaRandomStrategy());  // Correct instantiation of inner class
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number " + (i + 1) + ": " + randomNumberService.generateRandomNumber());
        }

        // Show LCG Random Strategy
        System.out.println("\nUsing LCG Random Strategy:");
        randomNumberService.setStrategy(new RandomNumberService.LCGRandomStrategy(System.currentTimeMillis()));  // Correct instantiation of inner class
        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number " + (i + 1) + ": " + randomNumberService.generateRandomNumber());
        }
    }
}
