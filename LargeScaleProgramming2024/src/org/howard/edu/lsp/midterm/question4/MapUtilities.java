package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // iterate through the first map's entries
        for (String key : map1.keySet()) {
            // check if the key exists in the second map and if values are equal
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }

        return commonCount;
    }
}

