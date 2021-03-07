import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pi = 3.14159;
        int R = scan.nextInt();
        double result = (4 / 3.0) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", result);
    }
}