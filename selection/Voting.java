package com.kn.selection;
import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age=");
		int age = scan.nextInt();
		if (age >= 18) {
			System.out.println("you are eligible for voting");
		}

	}

}
