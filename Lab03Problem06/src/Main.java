import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        double D = (b * b) - 4 * a * c;
        if (D > 0) {
            double r1 = ((-b) + Math.sqrt(D)) / (2 * a);
            double r2 = ((-b) - Math.sqrt(D)) / (2 * a);
            System.out.printf("The equation has two roots %.6f and %.5f%n", r1, r2);
        } else if (D == 0) {
            double r1 = ((-b) + Math.sqrt(D)) / (2 * a);
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}