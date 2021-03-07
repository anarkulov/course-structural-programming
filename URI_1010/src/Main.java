import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        int A = scan.nextInt();
        int B = scan.nextInt();
        double C = scan.nextDouble();

        System.out.println();
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = scan.nextDouble();

        double res = (B * C) + (b * c);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", res);
    }
}