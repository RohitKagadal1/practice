package com.kn.decrementforloop;

import java.util.Scanner;

public class DecrementingForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Range=");
		int num=scan.nextInt();
		scan.close();
		for(int i=num;i>=1;i--) {
			System.out.println(i);
		}

	}

}
