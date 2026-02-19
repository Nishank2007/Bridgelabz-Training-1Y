package com.gla.String.Level3;

public class CalendarLogic {
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return months[month - 1];
    }

    // Check Leap Year
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return true;
        return false;
    }

    // b) Get number of days in month
    public static int getDaysInMonth(int month, int year) {

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (month == 2 && isLeapYear(year))
            return 29;

        return days[month - 1];
    }

    // c) Get first day of month (Gregorian Algorithm)
    public static int getFirstDay(int month, int year) {

        int d = 1; // first date of month

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0; // 0 = Sunday
    }

    // Display calendar
    public static void displayCalendar(int month, int year) {

        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);

        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces before first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= totalDays; day++) {

            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }
}
