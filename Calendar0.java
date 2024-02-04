/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for (int i = 1; i <= 12; i++) {
			System.out.println("Month " + i + " has " + nDaysInMonth(i, year) + " days");
		}

	}

	public static boolean isLeapYear(int year) {
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
	
	public static int nDaysInMonth(int month, int year) {
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
