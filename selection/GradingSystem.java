package com.kn.selection;
import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=scan.nextInt();
Grade g1=new Grade();
g1.checkGrade(marks);

	}

}
