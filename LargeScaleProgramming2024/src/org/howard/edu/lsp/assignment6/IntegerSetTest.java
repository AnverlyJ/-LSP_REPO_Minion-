
package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

//https://eclipse.dev/eclipse/news/4.7.1a/#junit-5-support

 class IntegerSetTest {

    @Test
    @DisplayName("Test case for adding elements")
    public void testAddElement() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        assertTrue(set.contains(5), "Set should contain 5 after adding it");

        set.add(5); // Adding the same element again
        assertEquals(1, set.length(), "Set should not contain duplicate elements");
    }

    @Test
    @DisplayName("Test case for removing elements")
    public void testRemoveElement() {
        IntegerSet set = new IntegerSet();
        set.add(5);
        set.add(10);
        set.remove(5);
        assertFalse(set.contains(5), "Set should not contain 5 after removing it");
        assertEquals(1, set.length(), "Set should have only one element left");
    }

    @Test
    @DisplayName("Test case for union operation")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.union(set2);
        assertTrue(set1.contains(1), "Union should contain 1");
        assertTrue(set1.contains(2), "Union should contain 2");
        assertTrue(set1.contains(3), "Union should contain 3");
        assertEquals(3, set1.length(), "Union should contain 3 distinct elements");
    }

    @Test
    @DisplayName("Test case for intersection operation")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        List<Integer> intersection = set1.intersect(set2);
        assertEquals(2, intersection.size(), "Intersection should have 2 elements");
        assertTrue(intersection.contains(2), "Intersection should contain 2");
        assertTrue(intersection.contains(3), "Intersection should contain 3");
    }

    @Test
    @DisplayName("Test case for difference operation")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.diff(set2);
        assertFalse(set1.contains(2), "Difference should not contain 2");
        assertFalse(set1.contains(3), "Difference should not contain 3");
        assertTrue(set1.contains(1), "Difference should still contain 1");
    }

    @Test
    @DisplayName("Test case for complement operation")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);

        IntegerSet set2 = new IntegerSet();
        set2.add(1);
        set2.add(2);

        set1.complement(set2);
        assertTrue(set1.contains(2), "Complement should add missing element 2");
        assertEquals(2, set1.length(), "Complement should add only 2");
    }

    @Test
    @DisplayName("Test case for largest element")
    public void testLargest() throws Exception {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(1);
        set.add(5);

        assertEquals(5, set.largest(), "Largest element should be 5");

        IntegerSet emptySet = new IntegerSet();
        Exception exception = assertThrows(Exception.class, () -> emptySet.largest());
        assertEquals("Set is empty", exception.getMessage(), "Empty set should throw an exception");
    }

    @Test
    @DisplayName("Test case for smallest element")
    public void testSmallest() throws Exception {
        IntegerSet set = new IntegerSet();
        set.add(3);
        set.add(1);
        set.add(5);

        assertEquals(1, set.smallest(), "Smallest element should be 1");

        IntegerSet emptySet = new IntegerSet();
        Exception exception = assertThrows(Exception.class, () -> emptySet.smallest());
        assertEquals("Set is empty", exception.getMessage(), "Empty set should throw an exception");
    }

    @Test
    @DisplayName("Test case for equality of sets")
    public void testEquality() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(1);

        assertTrue(set1.equals(set2), "Sets with the same elements should be equal");

        IntegerSet set3 = new IntegerSet();
        set3.add(1);
        set3.add(3);

        assertFalse(set1.equals(set3), "Sets with different elements should not be equal");
    }

    @Test
    @DisplayName("Test case for empty set")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "New set should be empty");

        set.add(1);
        assertFalse(set.isEmpty(), "Set should not be empty after adding an element");
    }

    @Test
    @DisplayName("Test case for string representation")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);

        String expectedString = "[1, 2, 3]";
        assertEquals(expectedString, set.toString(), "String representation should match expected format");
    }
}
