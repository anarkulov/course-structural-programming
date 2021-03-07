import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double A, B, C;
         A = 2;
         B = 3;
         C = 5;
         double a = scanner.nextDouble();
         double b = scanner.nextDouble();
         double c = scanner.nextDouble();
         double sum = ((a*A) + (b*B) + (c*C)) / 10;

         System.out.printf("MEDIA = %.1f%n", sum);
    }
}