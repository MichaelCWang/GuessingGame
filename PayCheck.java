/**
 * PayCheck.java
 * Michael Wang
 * ID: mwang98
 * Introduction to Programming, Programming Assignment 1
 * Program calculates total PayCheck amount given hourly rate and
 * hour worked and accounts for overtime hours 
 * 
 */

import java.util.Scanner;// import Scanner

public class PayCheck {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// declare and initialize Scanner object
		double overtime_time, regular_hours = 0;// declare and initialize variables
		System.out.println("Please enter the total hours worked Monday through Sunday.");
		double hours = in.nextDouble();// takes in next double to be the number of hours worked
		//System.out.println(regular_hours); Debugging
		if(hours > 40) {
			regular_hours = 40;
			overtime_time = hours - 40;
			//System.out.println(overtime_time); Debugging
		}
		else {
			overtime_time = 0;
		}
		// if else statement checks for total overtime hours
		System.out.println("Please enter your pay rate (in terms of dollars per hour).");
		double wage = in.nextDouble();// takes in next integer as the wage
		double overtime_wage = wage *1.5;// calculates overtime wage per hour
		double salary = regular_hours * wage;// calculates wage without overtime
		double overtime_pay = overtime_time * overtime_wage;// calculates total overtime pay
		//System.out.println("regular pay is:" + salary); Debugging for errors in regular pay
		//System.out.println("overtime pay is:" + overtime_pay); Debugging for errors in overtime pay
		double total = salary + overtime_pay; // calculate total paycheck
		System.out.print("Your paycheck for this week is: ");
		System.out.printf("%.2f", total);// format decimal place to two digits

	}

}
