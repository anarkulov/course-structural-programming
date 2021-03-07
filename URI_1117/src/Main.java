import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int counter = 0;
        do {
            double x = scan.nextDouble();
            if (x >= 0 && x <= 10) {
                sum += x;
                counter++;
            } else {
                System.out.println("nota invalida");
            }
        } while (counter != 2);
        double average = sum / 2;
        System.out.printf("media = %.2f%n", average);
    }
}