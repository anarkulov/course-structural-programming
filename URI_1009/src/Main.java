import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double bonus = a + (b * 15/100);

        System.out.printf("TOTAL = R$ %.2f%n", bonus);
    }
}