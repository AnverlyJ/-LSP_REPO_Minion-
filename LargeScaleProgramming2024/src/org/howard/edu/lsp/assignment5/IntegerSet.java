
package org.howard.edu.lsp.assignment5;

import java.util.List;
import java.util.ArrayList;

public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List <Integer> set = new ArrayList<Integer>();

	/***
	 * 
	 * Default constructor
	 * */
	// Default Constructor
	public IntegerSet() {
		
	};

	/***
	 * 
	 * 
	 * */
	// Constructor if ...
	public IntegerSet (List<Integer> set) {
		this.set = set;
	}

	/***
	 * 
	 * clears set
	 * */
	// Clears the internal representation of the set. 5 pts.
public void clear() {
	
	set.clear();
};

/***
 * 
 * returns length of the set
 * */
// Returns the length of the set. 5 pts.
public int length() {
	return set.size();
}; // returns the length

/*
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
 * the equal method from the Object class. 10 pts.
*/
/***
 * Returns true if the two sets are equal 
 * this is only if they include all values that are the same in any order
 * 
 * */
public boolean equals(Object o) {
	
	if (this == o) return true;
	if (o instanceof IntegerSet) return true;
	IntegerSet otherSet = (IntegerSet) o ;
	
	if (this.length() != otherSet.length()) return false;
	return set.containsAll(otherSet.set);
}; 

/***
 * 
 * return true if the set contains specified value
 * */
// Returns true if the set contains the value, otherwise false. 5 pts.
public boolean contains(int value) {
	return set.contains(value);
};    

/***
 * return the largest item in set 
 * 
 * */
// Returns the largest item in the set. 5 pts.
public int largest() throws Exception  {
	if (set.isEmpty()) {
        throw new Exception("Set is empty");
    }
    return set.stream().max(Integer::compareTo).get();
}; 


/**
 
 * @return 
 * @throws Exception
 */
// Returns the smallest item in the set. 5 pts.
public int smallest() throws Exception {
	 if (set.isEmpty()) {
         throw new Exception("Set is empty");
     }
     return set.stream().min(Integer::compareTo).get();
	
};

/**
 * adds assignment to set if not already there
 * */
	// Adds an item to the set or does nothing it already there. 5 pts.	
 	public void add(int item) {
 		if (!set.contains (item));{
 			set.add(item);
 		}
 		
 	}; // adds item to the set or does nothing if it is in set

 	/***
	 * removes item from set if in set
	 * 
	 * */
	// Removes an item from the set or does nothing if not there. 5 pts.
public void remove(int item) {
	set.remove((Integer)item);
}; 

/***
 * return the union of two sets
 * 
 * */
// Set union. 11 pts.
public void union(IntegerSet intSetb) {
	 for (Integer item : intSetb.set) {
         if (!set.contains(item)) {
             set.add(item);
         }
     }
};

/***
 * 
 * returns the intersection of two different sets
 * */
// Set intersection, all elements in s1 and s2. 12 pts.
public void intersect(IntegerSet intSetb) {
	 List<Integer> intersection = new ArrayList<>();
	    for (int value: set) {
	        if (intSetb.contains(value)) {
	            intersection.add(value);
	        }
	    }
	    set = intersection;  // Replace original set with the intersection result
};

/***
 * 
 * the difference between the sets
 * 
 * */
// Set difference, i.e., s1 –s2. 12 pts.
public void diff(IntegerSet intSetb) // set difference, i.e. s1 - s2
{
	set.removeAll(intSetb.set);
	}

/***
 * complement of the set(everything not in the specific set)
 * 
 * */
// Set complement, all elements not in s1. 11 pts.
public void complement(IntegerSet intSetb) { 
	for (Integer item: intSetb.set) {
		if (!this.set.contains(item)) {
			this.set.add(item);
		}
	}
	
}

/***
 * return true if set is empty
 * 
 * */
// Returns true if the set is empty, false otherwise. 5 pts.
boolean isEmpty() {
	return set.isEmpty();
}

/***
 * return a string output of set
 * 
 * */
// Return String representation of your set.  This overrides the equal method from 
// the Object class. 5 pts.
public String toString() {
	return set.toString();
}	// return String representation of your set
}

