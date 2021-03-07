import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] N = new double[100];
        double T = scan.nextDouble();
        for (int i = 0; i < N.length; i++) {
            N[i] = T;
            System.out.printf("N[%d] = %.4f\n", i, N[i]);
            T /= 2;
        }
    }
}