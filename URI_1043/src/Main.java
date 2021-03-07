import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double P = a + b + c;
        double A = (a + b) / 2 * c;

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.printf("Perimetro = %.1f%n", P);
        }else {
            System.out.printf("Area = %.1f%n", A);
        }
    }
}