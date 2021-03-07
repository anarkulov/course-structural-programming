import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double res;
        for (int i = 1; i <= N; i++) {
            double x = scan.nextInt();
            double y = scan.nextInt();
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                res = x / y;
                System.out.printf("%.1f\n", res);
            }
        }
    }
}