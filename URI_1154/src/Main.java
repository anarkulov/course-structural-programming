import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age, counter = 0, total = 0;
        do {
            age = scan.nextInt();
            if (age > 0) {
                total += age;
                counter++;
            }
        } while (age > 0);
        double average = (double) total / counter;
        System.out.printf("%.2f%n", average);
    }
}
