import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pi = 3.14159;
        double R = scanner.nextDouble();
        double sum = pi*R*R;

        System.out.printf("A = %.4f%n", sum);


    }
}