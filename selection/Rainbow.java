package com.kn.selection;
import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char alphabet = scan.next().charAt(0);
		RainbowColour r1 = new RainbowColour();
		r1.checkTheColour(alphabet);
	}

}
