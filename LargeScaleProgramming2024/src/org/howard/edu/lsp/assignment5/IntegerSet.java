
package org.howard.edu.lsp.assignment5;

import java.util.List;
import java.util.ArrayList;

public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List <Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
		
	};

	// Constructor if yo
	public IntegerSet (List<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set. 5 pts.
public void clear() {
	
	set.clear();
};

// Returns the length of the set. 5 pts.
public int length() {
	return set.size();
}; // returns the length

/*
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
 * the equal method from the Object class. 10 pts.
*/
public boolean equals(Object o) {
	
	if (this == o) return true;
	if (o instanceof IntegerSet) return true;
	IntegerSet otherSet = (IntegerSet) o ;
	
	if (this.length() != otherSet.length()) return false;
	return set.containsAll(otherSet.set);
}; 

// Returns true if the set contains the value, otherwise false. 5 pts.
public boolean contains(int value) {
	return set.contains(value);
};    
// Returns the largest item in the set. 5 pts.
public int largest() throws Exception  {
	if (set.isEmpty()) {
        throw new Exception("Set is empty");
    }
    return set.stream().max(Integer::compareTo).get();
}; 

// Returns the smallest item in the set. 5 pts.
public int smallest() throws Exception {
	 if (set.isEmpty()) {
         throw new Exception("Set is empty");
     }
     return set.stream().min(Integer::compareTo).get();
	
};

	// Adds an item to the set or does nothing it already there. 5 pts.	
 	public void add(int item) {
 		if (!set.contains (item));{
 			set.add(item);
 		}
 		
 	}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there. 5 pts.
public void remove(int item) {
	set.remove((Integer)item);
}; 


// Set union. 11 pts.
public void union(IntegerSet intSetb) {
	 for (Integer item : intSetb.set) {
         if (!set.contains(item)) {
             set.add(item);
         }
     }
};

// Set intersection, all elements in s1 and s2. 12 pts.
public void intersect(IntegerSet intSetb) {
	set.removeIf(num->!intSetb.contains(num));
};


// Set difference, i.e., s1 –s2. 12 pts.
public void diff(IntegerSet intSetb) // set difference, i.e. s1 - s2
{
	set.removeAll(intSetb.set);
	}

// Set complement, all elements not in s1. 11 pts.
public void complement(IntegerSet intSetb) { 
	for (Integer item: intSetb.set) {
		if (!this.set.contains(item)) {
			this.set.add(item);
		}
	}
	
}

// Returns true if the set is empty, false otherwise. 5 pts.
boolean isEmpty() {
	return set.isEmpty();
}


// Return String representation of your set.  This overrides the equal method from 
// the Object class. 5 pts.
public String toString() {
	return set.toString();
}	// return String representation of your set
}

