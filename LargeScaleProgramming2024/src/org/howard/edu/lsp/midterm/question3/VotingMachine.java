package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    // holds candidate names and their corresponding vote counts
    private Map<String, Integer> candidates;

    public VotingMachine() {
        candidates = new HashMap<>();
    }

    // adding candidate
    public void addCandidate(String name) {
        // initialize candidate's vote count to 0
        candidates.put(name, 0);
    }

    //method to vote for a candidate
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            // increment the vote count 
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate not found: " + name);
        }
    }

    // method to return a string representation of the candidates and their votes
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Candidate Votes:\n");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }

   
}

