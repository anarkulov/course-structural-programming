import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();

        double result = 0;

        if (a <= 2000) {
            System.out.println("Isento");
        } else {
            if (a > 2000 && a <= 3000) {
                double A = a - 2000;
                result = A * 8 / 100;
            } else if (a > 3000 && a <= 4500) {
                double A = a - 2000;
                double B = A - 1000;
                A -= B;
                result = (A * 8 / 100) + (B * 18 / 100);
            } else {
                double A = a - 2000;
                double B = A - 1000;
                double C = B - 1500;
                A -= B; // 1000
                B -= C;
                result = (A * 8 / 100) + (B * 18 / 100) + (C * 28 / 100);
            }
            System.out.printf("R$ %.2f%n", result);
        }
    }
}
