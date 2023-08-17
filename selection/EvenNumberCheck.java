package com.kn.selection;
import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number=");
		int number=scan.nextInt();
		if(number%2==0) {
			System.out.println("The given number is even");
			scan.close();
		}

	}

}
