import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double weight = scan.nextDouble();
        if (weight > 0) {
            if (weight <= 1) {
                System.out.println("Shipping cost will be 3.5$");
            } else if (weight <= 3) {
                System.out.println("Shipping cost will be 5.5$");
            } else if (weight <= 10) {
                System.out.println("Shipping cost will be 8.5$");
            } else if (weight <= 20) {
                System.out.println("Shipping cost will be 10.5$");
            }
        } else if (weight > 50) {
            System.out.println("The package cannot be shipped");
        }
    }
}