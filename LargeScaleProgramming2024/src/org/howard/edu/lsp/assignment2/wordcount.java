package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wordcount {
    public static void main(String[] args) {
        
        // Specify the path to the input file HERE (input file Name)
        String filePath = "words.txt"; 
        
        // Create HashMap
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        // using expression to account for words i want counted
        Pattern pattern = Pattern.compile("\\w+('|\\w+)?");
        
        // Reading file and processing 
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line.toLowerCase());
                
                while (matcher.find()) {
                    String token = matcher.group();
                    
                    // Remove the apostrophe from the token
                    String[] parts = token.split("'");
                    for (String part : parts) {
                        if (!part.isEmpty() && part.length() >= 4) {
                            // Process the valid part and update the map
                            wordCountMap.put(part, wordCountMap.getOrDefault(part, 0) + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Print token and value
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
