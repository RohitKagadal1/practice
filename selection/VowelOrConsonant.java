package com.kn.selection;
import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// taking input from end user
		System.out.println("Enter the character");
		char alphabet = scan.next().charAt(0);
		checkVowelOrConsonant(alphabet);

		scan.close();

	}

	public static void checkVowelOrConsonant(char alphabet) {
		// passing the conditions
		if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'||alphabet =='A'||alphabet == 'E'||alphabet == 'I'||alphabet == 'O'||alphabet == 'U'){
			//printing the message
			System.out.println("The given character"+alphabet+"is vowel");
		}
		else {
			//printing the message
			System.out.println("The given character"+alphabet+"is consonant");
		}
		
	}

}
