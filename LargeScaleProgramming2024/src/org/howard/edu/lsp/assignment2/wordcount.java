package org.howard.edu.lsp.assignment2;

// 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class wordcount{
	public static void main(String args[]) {
		
		 // Specify the path to the input file HERE (input file Name)
        String filePath = "words.txt"; 
        
        
		//create HashMap
		HashMap<String, Integer> wordCountMap = new HashMap<>();
		
		// input file
		
		
		// Reading file and processing using bufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
		
		//create tokenizer function and format string to lowercase
		StringTokenizer str_arr = new StringTokenizer(line.toLowerCase());
		
		
		//count the tokens and how frequent each is
		while (str_arr.hasMoreTokens()) {
			String word = str_arr.nextToken();
			//words length 3 or lower ignored
			 if (word.length() >= 4) {
	              wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
	          }
		}
		 
            
        }
      //exception for error
    } catch (IOException e) {
        e.printStackTrace();
    }
		
		//print token and value of 
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
	
}