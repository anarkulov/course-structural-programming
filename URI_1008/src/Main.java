import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = scanner.nextDouble();
        double res = b * c;

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f%n", res);
    }
}