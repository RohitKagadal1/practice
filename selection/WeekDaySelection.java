package com.kn.selection;

public class WeekDaySelection {
	public void findWeekDay(int number) {
		if (number == 1) {
			System.out.println("Sunday");
		} else if (number == 2) {
			System.out.println("Monday");
		} else if (number == 3) {
			System.out.println("Tuesday");
		} else if (number == 4) {
			System.out.println("Wednesday");
		} else if (number == 5) {
			System.out.println("Thursday");
		} else if (number == 6) {
			System.out.println("Friday");
		} else if (number == 7) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid input");
		}
	}
}
