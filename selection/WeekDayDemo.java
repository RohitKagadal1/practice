package com.kn.selection;
import java.util.Scanner;

public class WeekDayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number=");
		int number = scan.nextInt();
		WeekDaySelection w1 = new WeekDaySelection();
		w1.findWeekDay(number);
		scan.close();
	}

}
