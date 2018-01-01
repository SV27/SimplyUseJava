package com.simplyusejava.dl;

/**
 * This Class example demonstrates the use of Decision makers and looping syntax used in java.
 * @author SimplyUseJava
 *
 */

public class LazyDude {
	
	public static void main(String[] args) {
		
		String today = "holiday_1";  // declaring what day is today.
		int time = 7; // this lazy dude wakes up by 7 AM.
		int sunday = 1;
		// if loop example
		if(7 == time) { // '==' operator compares the two values, and produces true if they are equal.
			System.out.println("Waking up from the bed...");
		}
		
		if("holiday".equals(today)) { // This is how we need to compare the two strings are equal or not.
			
			// switch statement checks the varaible value being pased on and evaluates the matching case.
			switch(sunday) {
			 case 0:
				 // this will be executed if sunday value equals to 0
				 System.out.println("Today is not sunday");
				 break;
			 case 1:
				// this will be executed if sunday value equals to 1
				 System.out.println("Today is sunday");
				 System.out.println("Going to Chruch");
				 break;
			 default:
				// this will be executed if sunday value matched any of the condition above.
				 System.out.println(" no match found ");
			}
			
			boolean isGameOn = true; // declaring a boolean variable.
			if(isGameOn) { // this how we evaluates boolean variable.
				System.out.println("Game Started....");
				boolean gameend = true;
				int gameinnings = 0;
				do {
					// this is an example of "do...while" loop. this loop executes until the expression inside the while become false.
					gameinnings = gameinnings + 1;
					if(gameinnings > 9) {
						gameend = false;
					}
					System.out.println( gameinnings +" innings ends.");
				}while(gameend);
				System.out.println("Game Ends.... ");
			}
			
		}else {
			// this section will be executed when today not equal to "holiday".
			
			System.out.println("Today is Workday");
			
			boolean workStrats = true;
			int wrkHr = 0;
			while(workStrats) { 
				/* This is an example of "While" loop implementation. 
				* This loop executes the commands inside until its evaluated expression become false.
				*/
				wrkHr ++; // this is another simplified syntax for incrementing the value by 1.
				System.out.println("Strated working ..... hr " + wrkHr);
				if(wrkHr == 8) {
					// if the work hour reaches value of 8, then this loop exits.
					workStrats = false;
				}
			}
			
		}
		
		// Now we see an example of "for" loop.
		
		/**
		 * We are going to add 10 elements to an array using "for" loop.
		 * "for" loop is used to execute a task repeatedly for "n" number of times.
		 */
		
		// declaring an array to store integer value.
		int[] arry = new int[10];
		
		// for loop to add elements in the array.
		
		for(int i = 0; i < 10; i++) {
			/**
			 * This is the syntax for "for" loop.
			 * "int i=0" ==> this intializes a varaible which can be  used to evaluate against the "N" number.
			 * " i < 10 " ==> this means how many times this loop has to executed
			 *       or this loop executes until this expression become false.
			 *  " i++ " means, how you want to increment the looping variable upon completion of a task.
			 */
			
			// adding value of i at array.
			arry[i] = i;
			System.out.println(i +" is added to array");
		}
		
		// for each loop example.
		/**
		 * "foreach" loop is used to execute a list of elements and process them one by one.
		 * in this below example, we are going to retrieve the elements added to the array and process them one by one. 
		 */
		
		for(int i : arry) {
			System.out.println("Value from array : " +i);
		}
		
	}

}
