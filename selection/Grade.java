package com.kn.selection;

public class Grade {
public void checkGrade(int marks) {
	if (marks>90) {
		System.out.println("A");
	}
	else if(marks>75&&marks<=90) {
		System.out.println("B");
	}
	else if(marks>60&&marks<=75) {
		System.out.println("C");
	}
	else if(marks>45&&marks<=60) {
		System.out.println("D");
	}
	else if(marks>=35&&marks<=45) {
		System.out.println("E");
	}
	else if(marks<35) {
		System.out.println("Fail");
	}
}
}
