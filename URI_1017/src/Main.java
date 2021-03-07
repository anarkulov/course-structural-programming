import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double L = 12.0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        double res = (a * b) / L;
        System.out.printf("%.3f%n", res);
    }
}