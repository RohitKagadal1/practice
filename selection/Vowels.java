package com.kn.selection;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character");
		char c = scan.next().charAt(0);
		scan.close();
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c=='A'||c=='E'||c=='i'||c=='o'||c=='u') {
			System.out.println("It is a vowel");
		}

	}
}