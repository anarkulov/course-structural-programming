import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int number = scan.nextInt();
        int p = 312032486;
        int sec = 365 * 24 * 60 * 60;
        double result = (sec / 7.0);
        double result2 = result - (sec / 13.0);
        double result3 = (result2 + (sec / 45.0)) * number;
        double result4 = result3 + p;
        System.out.printf("The population in %d years %.0f%n", number, result4);
    }
}