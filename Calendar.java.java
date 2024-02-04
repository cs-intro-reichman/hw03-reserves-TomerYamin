/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	int givenYear = Integer.parseInt(args[0]);
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int specialSundays = 0;
	int check = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
		int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition
		//dayOfMonth <= nDaysInMonth(month, year) && 
		while (year < givenYear + 1) {
	 		advance();
			//debugDaysCounter++;
			if (debugDaysCounter == 100) { 
				break;
			}
		}
	 	//debugDaysCounter++;
	}
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		
        
		
	 	//// Write the necessary ending code here

	
	 // Advances the date (day, month, year) and the day-of-the-week. javac Calendar1.java
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
			System.out.println(dayOfMonth + "/" + month + "/" +  year + (dayOfWeek == 1 ? " Sunday": "" ));
			dayOfMonth++;
			dayOfWeek++;
				if  (dayOfWeek == 8) {
					dayOfWeek = 1;

				}


				if (dayOfMonth == nDaysInMonth(month, year) + 1 ) {
					month++;
					dayOfMonth = 1;
					nDaysInMonth(month, year);
				}	

				if (month == 13) {
					month = 1;
					year++;
				}

			
	 } 
		 
	private static boolean isLeapYear(int year) {
	    boolean isLeap = false;
		if ((year%400 ==0) || (year%4 ==0 && year%100 !=0)) {
			isLeap = true;		
	    	} 


		return isLeap;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int daysInMonth = 0;
		if (isLeapYear(year) == true) {
			switch (month) {
			case 1: 
				daysInMonth = 31;
				break;
			case 2: 
				daysInMonth = 29;
				break;
			case 3: 
				daysInMonth = 31;
				break;
			case 4: 
				daysInMonth = 30;
				break;	
			case 5: 
				daysInMonth = 31;
				break;
			case 6: 
				daysInMonth = 30;
				break;
			case 7: 
				daysInMonth = 31;
				break;
			case 8: 
				daysInMonth = 31;
				break;
			case 9: 
				daysInMonth = 30;
				break;
			case 10: 
				daysInMonth = 31;
				break;
			case 11: 
				daysInMonth = 30;
				break;
			case 12: 
				daysInMonth = 31;
				break;
			}	

		}

		else {
			switch (month) {
			case 1: 
				daysInMonth = 31;
				break;
			case 2: 
				daysInMonth = 28;
				break;
			case 3: 
				daysInMonth = 31;
				break;
			case 4: 
				daysInMonth = 30;
				break;	
			case 5: 
				daysInMonth = 31;
				break;
			case 6: 
				daysInMonth = 30;
				break;
			case 7: 
				daysInMonth = 31;
				break;
			case 8: 
				daysInMonth = 31;
				break;
			case 9: 
				daysInMonth = 30;
				break;
			case 10: 
				daysInMonth = 31;
				break;
			case 11: 
				daysInMonth = 30;
				break;
			case 12: 
				daysInMonth = 31;
				break;
				
			}
		
		}
	return daysInMonth;
	}
}
	