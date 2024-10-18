package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilitiesDriver {
    public static void main(String[] args) {
        // create map1 and add name-value pairs
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Alice", "Engineer");
        map1.put("Bob", "Artist");
        map1.put("Charlie", "Doctor");

        // create map2 and add name-value pairs
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Alice", "Engineer");
        map2.put("David", "Chef");
        map2.put("Charlie", "Nurse");

        // output the number of common key/value pairs
        System.out.println("Number of common key/value pairs is: " +  
            MapUtilities.commonKeyValuePairs(map1, map2));
    }
}

