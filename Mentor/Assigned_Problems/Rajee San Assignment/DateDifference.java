package rajeesanassignment;

import java.util.Scanner;

public class DateDifference {

    private final int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

    Scanner scanner = new Scanner(System.in);

    protected void init() {

        int[] date1 = new int[3];
        int[] date2 = new int[3];
        System.out.print("ENTER First DATE : ");
        date1[0] = scanner.nextInt();
        System.out.print("ENTER First MONTH : ");
        date1[1] = scanner.nextInt();
        System.out.print("ENTER First YEAR : ");
        date1[2] = scanner.nextInt();
        System.out.print("ENTER second DATE : ");
        date2[0] = scanner.nextInt();
        System.out.print("ENTER second MONTH : ");
        date2[1] = scanner.nextInt();
        System.out.print("ENTER second YEAR : ");
        date2[2] = scanner.nextInt();
        int d1 = daysCount(date1);
        int d2 = daysCount(date2);
        System.out.println("DIFFERENCE BETWEEN TWO DAYS : " + (d2 - d1));
    }

    private int daysCount(int[] date) {
        int days = date[2] * 365 + date[0];
        for (int i = 0; i < date[1] - 1; i++) days += monthDays[i];
        days += countLeap(date);
        return days;
    }

    private int countLeap(int[] date) {
        int year = date[2];
        if (date[1] <= 2) year--;
        return year / 4 - year / 100 + year / 400;
    }

    public static void main(String[] args) {
        DateDifference dateDifference = new DateDifference();
        dateDifference.init();
    }
}
