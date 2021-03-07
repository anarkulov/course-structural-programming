import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int n1 = scan.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int n2 = scan.nextInt();

        String today = "", futureDay = "";
        int day = (n1 + n2) % 7;

        if (n1 == 0) {
            today = "Sunday";
        }
        if (day == 0) {
            futureDay = "Sunday";
        }
        if (n1 == 1) {
            today = "Monday";
        }
        if (day == 1) {
            futureDay = "Monday";
        }
        if (n1 == 2) {
            today = "Tuesday";
        }
        if (day == 2) {
            futureDay = "Tuesday";
        }
        if (n1 == 3) {
            today = "Wednesday";
        }
        if (day == 3) {
            futureDay = "Wednesday";
        }
        if (n1 == 4) {
            today = "Thursday";
        }
        if (day == 5) {
            futureDay = "Thursday";
        }
        if (n1 == 6) {
            today = "Saturday";
        }
        if (day == 6) {
            futureDay = "Saturday";
        }
        System.out.println("Today is " + today + " and the future day is " + futureDay);
    }
}