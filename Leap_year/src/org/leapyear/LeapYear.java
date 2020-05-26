package org.leapyear;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int year ;
		try {
			year = sc.nextInt();
			boolean isLeap = isLeapYear(year);
			 if(isLeap) {
				 System.out.println(year + " is a Leap Year");
			 }else {
				 System.out.println(year + " is not a Leap Year.");
			 }
		} catch (InputMismatchException e) {
			System.out.println("Please enter correct input");
		}
		
		
	}
	
	public static boolean isLeapYear(int year) {

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    return true;
                else
                	return false;
            }
            else
            	return true;
        }
        else {
        	return false;
        }
    
	}

}
