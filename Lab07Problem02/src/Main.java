import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Year? ");
        int year = scan.nextInt();

        System.out.print("Month? ");
        int month = scan.nextInt();

        int numberOfDays = getNumberOfDays(year, month);

        System.out.println("Number of days: " + numberOfDays);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getNumberOfDays(int year, int month) {
        int feb = isLeapYear(year) ? 29 : 28;
        int[] n = {31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return n[month - 1];
    }
}