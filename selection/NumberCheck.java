package com.kn.selection;
import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number=");
		int number=scan.nextInt();
		scan.close();
		if(number>=0) {
			System.out.println("The given number is positive");
		}

	}

}
