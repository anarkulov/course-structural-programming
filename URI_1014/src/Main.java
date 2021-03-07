import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        double Y = scan.nextDouble();
        double res = X / Y;
        System.out.printf("%.3f km/l%n", res);
    }
}