package com.wipro.java.java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

	public static void CheckingAdjusters() {
		LocalDate date=LocalDate.now();
		System.out.println("The current date is : " +date);
		
		// To get the first day of next month
		LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First Day of next month : " +dayOfNextMonth);
		
		//to get the next Saturday
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next  saturday from now is :" +nextSaturday);
		
		// First day of current month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First day of this month : " +firstDay);
		
		//Last day of current month 
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of this month : " +lastDay);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAdjusters();

	}

}
