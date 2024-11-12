package org.howard.edu.lsp.assignment6;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a set of integers, providing set operations such as union, intersection, 
 * difference, and complement. Also supports finding the largest and smallest elements.
 */
public class IntegerSet {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<>();

	/**
	 * Default constructor that creates an empty set.
	 */
	public IntegerSet() {
	}

	/**
	 * Constructor that initializes the set with a given list of integers.
	 * 
	 * @param set the initial list of integers for the set
	 */
	public IntegerSet(List<Integer> set) {
		this.set = set;
	}

	/**
	 * Clears the set, removing all elements.
	 */
	public void clear() {
		set.clear();
	}

	/**
	 * Returns the number of elements in the set.
	 * 
	 * @return the size of the set
	 */
	public int length() {
		return set.size();
	}

	/**
	 * Checks if this set is equal to another set. Two sets are considered equal
	 * if they contain all the same elements in any order.
	 * 
	 * @param o the object to compare with this set
	 * @return true if the sets are equal, false otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof IntegerSet)) return false;
		IntegerSet otherSet = (IntegerSet) o;
		return this.length() == otherSet.length() && set.containsAll(otherSet.set);
	}

	/**
	 * Checks if the set contains a specified value.
	 * 
	 * @param value the integer to check for in the set
	 * @return true if the value is in the set, false otherwise
	 */
	public boolean contains(int value) {
		return set.contains(value);
	}

	/**
	 * Finds and returns the largest element in the set.
	 * 
	 * @return the largest integer in the set
	 * @throws Exception if the set is empty
	 */
	public int largest() throws Exception {
		if (set.isEmpty()) {
			throw new Exception("Set is empty");
		}
		return set.stream().max(Integer::compareTo).get();
	}

	/**
	 * Finds and returns the smallest element in the set.
	 * 
	 * @return the smallest integer in the set
	 * @throws Exception if the set is empty
	 */
	public int smallest() throws Exception {
		if (set.isEmpty()) {
			throw new Exception("Set is empty");
		}
		return set.stream().min(Integer::compareTo).get();
	}

	/**
	 * Adds an item to the set if it is not already present.
	 * 
	 * @param item the integer to add to the set
	 */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}

	/**
	 * Removes an item from the set if it is present.
	 * 
	 * @param item the integer to remove from the set
	 */
	public void remove(int item) {
		set.remove((Integer) item);
	}

	/**
	 * Updates this set to be the union of this set and another set.
	 * 
	 * @param intSetb the other set to union with
	 */
	public void union(IntegerSet intSetb) {
		for (Integer item : intSetb.set) {
			if (!set.contains(item)) {
				set.add(item);
			}
		}
	}

	/**
	 * Updates this set to contain only elements that are also in another set 
	 * (intersection of the two sets).
	 * 
	 * @param intSetb the other set to intersect with
	 * @return 
	 */
	public List<Integer> intersect(IntegerSet intSetb) {
	    List<Integer> intersection = new ArrayList<>(); // New list to hold common elements
	    
	    // Iterate over elements in the current set
	    for (int value : set) {
	        // Check if each element is also in intSetb
	        if (intSetb.contains(value)) {
	            intersection.add(value); // Add to intersection if found in both sets
	        }
	    }
	    
	    // Replace current set with the intersection result
	    set.clear(); // Clear original set
	    set.addAll(intersection); // Add only common elements
	    return intersection;
	}
	
	/**
	 * Updates this set to contain only elements that are not in another set (difference).
	 * 
	 * @param intSetb the other set to differentiate from
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}

	/**
	 * Updates this set to contain elements not in the specified set, effectively 
	 * adding elements from the other set that are missing in this set.
	 * 
	 * @param intSetb the other set for complement operation
	 */
	public void complement(IntegerSet intSetb) {
		for (Integer item : intSetb.set) {
			if (!set.contains(item)) {
				set.add(item);
			}
		}
	}

	/**
	 * Checks if the set is empty.
	 * 
	 * @return true if the set has no elements, false otherwise
	 */
	public boolean isEmpty() {
		return set.isEmpty();
	}

	/**
	 * Returns a string representation of the set.
	 * 
	 * @return the string representation of the set
	 */
	@Override
	public String toString() {
		return set.toString();
	}
}
