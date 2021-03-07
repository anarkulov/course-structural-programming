import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double CM_IN_INCH = 2.54;

        Scanner scan = new Scanner(System.in);

        System.out.print("Length in inches? ");
        double lengthInInches = scan.nextDouble();

        double lengthIncCm = lengthInInches * CM_IN_INCH;
        System.out.printf("%.2f in. = %.2f cm.%n", lengthInInches, lengthIncCm);
    }
}