package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Please input a year");
		int year = in.nextInt();
		double mod = year % 4;
		double mod1 = year % 100;
		double mod2 = year % 400;
		boolean leapYear = (0 == mod && 0 != mod1 || mod2 == 0);
		System.out.println(year + " is a leap year: " + leapYear);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

	
	
}
