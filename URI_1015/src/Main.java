import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double res = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.printf("%.4f%n", res);
    }
}