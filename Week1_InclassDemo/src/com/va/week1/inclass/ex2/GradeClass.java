package com.va.week1.inclass.ex2;

import java.util.Scanner;

public class GradeClass {

	public static void main(String args[])

	{

		double course1, course2, course3;
		double average;
		double maxscore;
		double minscore;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 subjects now..");
		course1 = sc.nextDouble();
		course2 = sc.nextDouble();
		course3 = sc.nextDouble();

		average = (course1 + course2 + course3) / 3;
		System.out.println("Average is" + average);

		// for max try using function ..
		
		System.out.println(Math.max(course1,course2));  // this will do for 2 nos only.. 
		// you have to do for 3 params.. think? 

	}

}
