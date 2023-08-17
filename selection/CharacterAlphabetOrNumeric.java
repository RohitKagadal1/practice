package com.kn.selection;
import java.util.Scanner;

public class CharacterAlphabetOrNumeric {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//taking input from end user
		System.out.println("Enter the character");
char alphabet=scan.next().charAt(0);
checkForCharacterOrAlphabet(alphabet);
scan.close();
	}

	public static void checkForCharacterOrAlphabet(char alphabet) {
		//check whether the alphabet is the range
		if(alphabet>=65 && alphabet<=90) {
			System.out.println("The character is  in the range");
		}else {
			System.out.println("The character is not in the range");
		}
		
	}

}
