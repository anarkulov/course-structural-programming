import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x, number, result;
        int finish, counter;
        do {
            number = 0;
            counter = 0;
            do {
                x = scan.nextDouble();
                if (x >= 0 && x <= 10) {
                    number += x;
                    counter++;
                } else {
                    System.out.println("nota invalida");
                }
            } while (counter != 2);
            result = number / 2;
            System.out.printf("media = %.2f%n", result);

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                finish = scan.nextInt();
            } while (finish != 1 && finish != 2);
        } while (finish == 1);
    }
}