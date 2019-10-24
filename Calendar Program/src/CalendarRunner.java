/**
 * 
 * @author Kevin Falconett
 *@version 1.0b
 *
 *made to run the CalendarDate Class
 *
 */

public class CalendarRunner {
	/**
	 * 
	 * @param argument
	 */
	public static void main(String[] argument) {
		
		//constructing
		CalendarDate test = new CalendarDate();
		CalendarDate d0 = new CalendarDate();
		CalendarDate d1 = new CalendarDate();
		CalendarDate d2 = new CalendarDate();
		CalendarDate today = new CalendarDate();
		CalendarDate d3 = new CalendarDate();
		//setting
		test.setAll(1, 1, 2019);
		d0.setAll(5, 1, 2018);
		d1.setAll(1, 3, 2020);
		d2.setAll(1, 1, 2019);
		today.setAll(28, 1, 2019);
		d3.setAll(5,3,2025);
		int day = 5;
		for(int i = 0; i<10; i++) {
			
			System.out.println(d3.dayAfter(d3));
			System.out.println(d3.weekDay(d3));
			day++;
			d3.setDay(day);
			
		}
		
		System.out.println("testing printing the day after");
		System.out.println(d0.dayAfter(d0));
		d0.setAll(28, 2, 2020);
		System.out.println(d0.dayAfter(d0));
		d0.setAll(28,2,2018);
		System.out.println(d0.dayAfter(d0));
		System.out.println("testing printing the day previous");
		System.out.println(d2.dayPrev(d2));
		System.out.println(d2.dayPrev(d1));
		
		System.out.println("testing weekdays");
		System.out.println("WeekDay for " +d2 );
		System.out.println(d2.weekDay(d2));
		System.out.println("WeekDay for " +d1 );
		System.out.println(d2.weekDay(d1));
		System.out.println("WeekDay for " +d0 );
		System.out.println(d2.weekDay(d0));
		System.out.println("Today: " +today);
		System.out.println(today.weekDay(today));
		System.out.println("WeekDay for " +d3 );
		System.out.println(d3.weekDay(d3));


		
		System.out.println("printing leap years ");
		System.out.println("2018 is a leap year: ");
		System.out.println(d0.isLeap(2018));
		System.out.println("2020 is a leap year:");
		System.out.println(d0.isLeap(2020));
		System.out.println("2019 is a leap year:");
		System.out.println(d0.isLeap(2019));
		System.out.println("1700 is a leap year: ");
		System.out.println(d0.isLeap(1700));

	}
}
/*
March , 6 , 2025
4
Thursday
March , 7 , 2025
5
Friday
March , 8 , 2025
6
Saturday
March , 9 , 2025
0
Sunday
March , 10 , 2025
1
Monday
March , 11 , 2025
2
Tuesday
March , 12 , 2025
3
Wednesday
March , 13 , 2025
4
Thursday
March , 14 , 2025
5
Friday
March , 15 , 2025
6
Saturday
testing printing the day after
January , 6 , 2018
February , 29 , 2020
March , 1 , 2018
testing printing the day previous
December , 31 , 2018
February , 29 , 2020
testing weekdays
WeekDay for December , 31 , 2018
1
Monday
WeekDay for February , 29 , 2020
6
Saturday
WeekDay for March , 1 , 2018
4
Thursday
Today: January , 28 , 2019
1
Monday
WeekDay for March , 15 , 2025
6
Saturday
printing leap years 
2018 is a leap year: 
false
2020 is a leap year:
true
2019 is a leap year:
false
1700 is a leap year: 
false
*/