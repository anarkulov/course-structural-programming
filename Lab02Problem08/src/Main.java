import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  pound = 0.454
        Scanner scan = new Scanner(System.in);

        double p = 0.454;
        System.out.print("Enter a number in pounds: ");
        double number = scan.nextDouble();
        double result = number * p;
        System.out.printf(number + " pounds is %.3f%n", result);
    }
}