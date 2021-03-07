import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = 3.5;
        double B = 7.5;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = (a*A) + (b*B) / 11;

        System.out.printf("MEDIA = " + "%.5f%n", sum);
    }
}