package com.kn.selection;

public class RainbowColour {
	public void checkTheColour(char alphabet) {
		if (alphabet == 'V' || alphabet == 'v') {
			System.out.println("Voilet");
		} else if (alphabet == 'I' || alphabet == 'i') {
			System.out.println("Indigo");
		} else if (alphabet == 'B' || alphabet == 'b') {
			System.out.println("Blue");
		} else if (alphabet == 'G' || alphabet == 'g') {
			System.out.println("Green");
		} else if (alphabet == 'Y' || alphabet == 'y') {
			System.out.println("Yellow");
		} else if (alphabet == 'O' || alphabet == 'o') {
			System.out.println("Orange");
		} else if (alphabet == 'R' || alphabet == 'r') {
			System.out.println("Red");
		} else {
			System.out.println("The given character colour is not in rainbow");
		}
	}
}
