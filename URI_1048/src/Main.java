import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();

        if (a > 0 && a <= 400) {
            double sal = a + (a * (15.0/100));
            double per = a * (15.0/100);
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", per);
            System.out.println("Em percentual: 15 %");
        }else if (a > 400 && a <= 800) {
            double sal = a + (a * (12.0/100));
            double per = a * (12.0/100);
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", per);
            System.out.println("Em percentual: 12 %");
        }else if (a > 800 && a <= 1200) {
            double sal = a + (a * (10.0 / 100));
            double per = a * (10.0 / 100);
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", per);
            System.out.println("Em percentual: 10 %");
        }else if (a > 1200 && a <= 2000) {
            double sal = a + (a * (7.0 / 100));
            double per = a * (7.0 / 100);
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", per);
            System.out.println("Em percentual: 7 %");
        }else if (a > 2000) {
            double sal = a + (a * (4.0 / 100));
            double per = a * (4.0 / 100);
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", per);
            System.out.println("Em percentual: 4 %");
        }
    }
}