
/**
 * @author Kevin Falconett
 * @version 1.0b
 * 
 */
public class CalendarDate {

	//list of months both named and the amount of days they have
	final String[] monthNames = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	final int[] monthDays = {31,28,31,30,31,30,31,31,30,30,31,31};
	final int[] monthDays_Leap = {31,29,31,30,31,30,31,31,30,30,31,31};
	//list of weekdays
	final String[] weekDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	

	
	//private Data
	private int day;
	private int month;
	private int year;
	//end private data
	
	
	
	
	
	//constructor
	public CalendarDate() {
	}
	
	
	//gets + sets
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public void setAll(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	//end gets/sets
	
	/**
	 * @param A filled CalendarDate Object
	 * 
	 * @return A CalendarDate Object with the date after the initial object's date
	 */
	public String dayAfter(CalendarDate date) {

		int originDay = date.getDay();
		int originMonth = date.getMonth();
		int originYear = date.getYear();
		int[]months = monthDays;
		if(isLeap(originYear)) {
			months = monthDays_Leap;
		}

		int newDay = originDay;
		int newMonth = originMonth;
		int newYear = originYear;
		
		CalendarDate nextDay = new CalendarDate();
		nextDay = date;
		
		//check through the situations in which year or month would change
		
		//if next day is new year (so original is dec 31)
		if(originMonth == 12 && originDay == 31) {
			newYear = originYear+ 1;
			newMonth = 1;
			newDay = 1;
			nextDay.setYear(newYear);
			nextDay.setMonth(newMonth);
			nextDay.setDay(newDay);
		}
			//if the next day is a new month
			else if(originDay == months[originMonth -1]) {
				newMonth = originMonth + 1;
				newDay = 1;
				nextDay.setMonth(newMonth);
				nextDay.setDay(newDay);
			}
		//else means everything is normal and we can just add day
			else {
				nextDay.setMonth(newMonth);
				nextDay.setYear(newYear);
				nextDay.setDay(newDay + 1);
			}
		
		
		
		
		return nextDay.toString();
	}
	/**
	 * 
	 * @param CalendarDate object
	 * @return the previous date in String form
	 */
	public String dayPrev(CalendarDate date) {
		
		int originDay = date.getDay();
		int originMonth = date.getMonth();
		int originYear = date.getYear();
		int[]months = monthDays;
		if(isLeap(originYear)) {
			months = monthDays_Leap;
		}
		int newDay = originDay;
		int newMonth = originMonth;
		int newYear = originYear;
		
		CalendarDate nextDay = new CalendarDate();
		nextDay = date;
		
		//check through the situations in which year or month would change
		
		//if previous day is past year (so original is jan 1)
		if(originMonth == 1 && originDay == 1) {
			newYear = originYear- 1;
			newMonth = 12;
			newDay = 31;
			nextDay.setYear(newYear);
			nextDay.setMonth(newMonth);
			nextDay.setDay(newDay);
		}
			//if the previous day is a different month
			else if(originDay == (months[originMonth -1] - (months[originMonth-1]-1))) {
				newMonth = originMonth -1;
				newDay = months[newMonth -1];
				nextDay.setMonth(newMonth);
				nextDay.setDay(newDay);
			}
		
		//else means everything is normal and we can just subtract day
			else {
				nextDay.setMonth(newMonth);
				nextDay.setYear(newYear);
				nextDay.setDay(newDay - 1);
			}
		
		
		
		
		return nextDay.toString();

	}
	
	/**
	 * 
	 * @param year
	 * @return true is the year is a leap year, returns false otherwise
	 */
	public boolean isLeap(int year) {
		
		boolean by4 = year %4 == 0;
		boolean by100 = year % 100 == 0;
		boolean by400 = year % 400 == 0;
		
		if(by4) {
			if (by100 && by400) {
				return true;
			}
			else if(by4 && (by100 == false)) {
				return true;
			}
		}
	
		return false;
	
}
	/**
	 * 
	 * @param CalendarDate Object
	 * @return The Weekday as a string
	 */
	public String weekDay(CalendarDate date) {
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDay();
		
		
		
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; //
	    year -= (month < 3) ? 1 : 0;  //if month is less than three then subtract 1, else subtract 0
	   
	    int dayIndex = ( year + year/4 - year/100 + year/400 + t[month-1] + day) % 7; 
	    
	    return weekDays[dayIndex];
	
	}
	
	/**
	 * @return CalendarDate in String form
	 */
	public String toString() {
		int monthIndex = this.month -1;
		String monthNamed = monthNames[monthIndex];
		return monthNamed+" , "+day+" , "+year;
		
	}

}
