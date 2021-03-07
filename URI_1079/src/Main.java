import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double A = a * 2;
            double B = b * 3;
            double C = c * 5;
            double res = (A + B + C) / 10;
            System.out.printf("%.1f%n", res);
        }
    }
}