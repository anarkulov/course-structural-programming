import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, counter = 0;
        double average = 0, sum = 0;
        do {
            number = scan.nextInt();
            sum += number;
            counter++;
        } while (number != 0);
        counter--;

        if (counter == 0) {
            System.err.println("Nothing to calculate");
            System.exit(-1);
        }
        average = sum / counter;
        System.out.printf("The arithmetic mean is %.1f\n", average);
    }
}
