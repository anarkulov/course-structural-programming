import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] n = new int[100];
        for (int i = 0; i < n.length; i++) {
            double x = scan.nextDouble();
            if (x <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, x);
            }
        }
    }
}
