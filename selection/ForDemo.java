package com.kn.selection;
import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		scan.close();
		for(int i=1; i<=10;i++) {
			System.out.println(i);
		}
				

	}

}
