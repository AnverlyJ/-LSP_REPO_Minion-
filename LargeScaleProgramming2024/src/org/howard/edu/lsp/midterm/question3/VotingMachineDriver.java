package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {

	 // main method for testing
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        vm.castVote("Hogan");
        vm.castVote("Hogan");
        System.out.println(vm.toString());
    }
}
