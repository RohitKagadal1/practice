package com.kn.selection;
import java.util.Scanner;

public class VotingEligiblityCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Taking input from end user
		System.out.println("Enter the age=");
		int age = scan.nextInt();

		checkForVotingEligiblity(age);
		scan.close();
	}

	public static void checkForVotingEligiblity(int age) {
		// Passing conditions
		if (age >= 18) {
			// printing eligibility message
			System.out.println("Congrulations,you are eligible for voting");
		} else {
			// printing non-eligibility message
			System.out.println("chotu go to school");
		}
	}

}
