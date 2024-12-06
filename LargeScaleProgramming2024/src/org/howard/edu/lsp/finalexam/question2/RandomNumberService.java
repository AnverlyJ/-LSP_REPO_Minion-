package org.howard.edu.lsp.finalexam.question2;
/**
 * Singleton service for generating random numbers using different strategies.
 */
public class RandomNumberService {

    // The singleton instance of RandomNumberService
    private static RandomNumberService instance;

    // A reference to the current random number strategy
    private RandomNumberStrategy strategy;

    // Private constructor to enforce singleton pattern
    private RandomNumberService() {}

    /**
     * Returns the singleton instance of the RandomNumberService.
     * If the instance does not exist, it creates a new one.
     * @return the singleton instance of RandomNumberService
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for generating random numbers.
     * This allows clients to choose the algorithm used for random number generation.
     * @param strategy the random number generation strategy
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the selected strategy.
     * @return a positive integer random number
     */
    public int generateRandomNumber() {
        return strategy.generate();
    }

    /**
     * A random number generation strategy that uses Java's built-in Random class.
     */
    public static class JavaRandomStrategy implements RandomNumberStrategy {
        private java.util.Random random;

        public JavaRandomStrategy() {
            this.random = new java.util.Random();
        }

        
        public int generate() {
            return random.nextInt(Integer.MAX_VALUE) + 1;  // Generate a positive number
        }
    }

    /**
     * A random number generation strategy that uses a Linear Congruential Generator (LCG).
     */
    public static class LCGRandomStrategy implements RandomNumberStrategy {
        private long seed;
        private final long a = 1664525;
        private final long c = 1013904223;
        private final long m = (1L << 32);

        public LCGRandomStrategy(long seed) {
            this.seed = seed;
        }

        @Override
        public int generate() {
            seed = (a * seed + c) % m;
            return (int) (seed & Integer.MAX_VALUE);  // Generate a positive number
        }
    }
}
