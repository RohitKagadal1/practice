package com.kn.selection;
import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// taking input from end user
		System.out.println("Enter the number");
		int number = scan.nextInt();
		checkEvenOrOdd(number);
		scan.close();

	}

	public static void checkEvenOrOdd(int number) {
		// passing conditions
		if (number % 2 == 0) {
			// printing the checked message
			System.out.println("The given number is even");
		} else {
			// printing the checked message
			System.out.println("The given number is odd");
		}

	}

}
