import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

        if (a == 0 || (Math.pow(b, 2) - 4 * a * c) < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = ((-b + d) / (2 * a));
            double R2 = ((-b - d) / (2 * a));

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
    }
}